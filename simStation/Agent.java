package simStation;

import java.io.Serializable;

public abstract class Agent implements Runnable, Serializable {
    protected Simulation world;
    protected Heading heading;
    int xc;
    int yc;
    boolean suspended = false;
    boolean stopped = false;
    Thread myThread;

    @Override
    public void run() {
        // TODO - calls update, falls asleep - when stopped is true, exit while loop
        myThread = Thread.currentThread();
        while (!isStopped()) {
            try {
                update();
                Thread.sleep(1000);
                checkSuspended();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public synchronized void join() {
        try {
            if (myThread != null) myThread.join();
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized boolean isStopped() {
        return stopped;
    }

    public synchronized void checkSuspended() {
        try {
            while (!stopped && suspended) {
                wait();
                suspended = false;
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void start() {
        // TODO
    }

    public synchronized void suspend() {
        suspended = true;
    }

    public synchronized void resume() {
        notify();
    }

    public synchronized void stop() {
        stopped = true;
    }

    // TODO - override in customization
    public abstract void update();

    public void move(int steps) {

        // TODO
    }

}
