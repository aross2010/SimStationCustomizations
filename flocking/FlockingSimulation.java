package flocking;

import mvc.AppPanel;
import simStation.Agent;
import simStation.Simulation;
import simStation.SimulationPanel;

public class FlockingSimulation extends Simulation {
    private final int NUM_OF_BIRDS = 50;

    @Override
    public void populate() {
        for(int i = 0; i < NUM_OF_BIRDS; i++)
            addAgent(new Bird());
    }

    @Override
    public String[] getStats(){
        int[] stats = new int[Bird.MAX_SPEED];
        for (Agent agent: agents) {
            int speed = ((Bird)agent).speed;
            for (int i = 0; i < Bird.MAX_SPEED; i++) {
                if (speed == i+1) {
                    stats[i]++;
                    break;
                }
            }
        }

        String[] statsMessage = new String[Bird.MAX_SPEED];
        
        for (int i = 0; i < statsMessage.length; i++) {
            statsMessage[i] = String.format("# of birds at Speed %d: %d", i+1, stats[i]);
        }

        return statsMessage;
    }

    public static void main(String[] args) {
        AppPanel panel = new SimulationPanel(new FlockingFactory());
        panel.display();
    }


}
