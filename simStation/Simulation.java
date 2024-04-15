package simStation;

import mvc.Model;
import mvc.Utilities;

import java.util.List;


public class Simulation extends Model {
    transient private Timer timer;
    protected int clock = 0;
    protected static List<Agent> agents = new ArrayList<>();


    private void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ClockUpdater(), 1000, 1000);
    }

    private void stopTimer() {
        timer.cancel();
        timer.purge();
    }

    public void start() {
        startTimer();
        agents.clear();
        populate();
        for (Agent agent : agents) {
            agent.start();
        }
        changed();
    }
    public static String[] getStats() //returns the number of agents. useful for stats
    {
        String[] stats = {String.valueOf(agents.size()), String.valueOf(clock)};
        return stats;
    }

    public void suspend() {
        // TODO - call suspend method for all agents
    }

    public void resume() {
        // TODO
    }

    public void stop() {
        // TODO
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
        agent.world = this; // set the agents world
    }

    private boolean isNeighbor(Agent a1, Agent a2, double radius) {
        // distance between agents - if distance less than radius, then neighbor
        double distance = Math.pow(a1.xc - a2.xc, 2) + Math.pow(a1.yc - a2.yc, 2);
        return radius > distance;
    }

    public Agent getNeighbor(Agent a, double radius) {
        int numAgents = agents.size();
        int position = Utilities.rng.nextInt(numAgents);
        for (int i = 0; i < numAgents; i++) {
            Agent currAgent = agents.get((position + i) % numAgents);
            if (isNeighbor(currAgent, a, radius)) return currAgent;
        }
        return null;
    }

    public String[] getStats()
    {
        String[] stats = {"agents = " + String.valueOf(agents.size()), "clock = " + String.valueOf(clock)};
        return stats;
    }

    // override in customization
    public void populate() {}


    private class ClockUpdater extends TimerTask {
        public void run() {
            clock++;
        }
    }

}
