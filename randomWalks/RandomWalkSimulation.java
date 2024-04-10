package randomWalks;

import simStation.Simulation;
import mvc.AppPanel;
import simStation.SimulationPanel;

public class RandomWalkSimulation extends Simulation {
    public void populate() {
        for(int i = 0; i < 15; i++)
            agents.add(new Drunk());
    }

    public static void main(String[] args) {
        AppPanel panel = new SimulationPanel(new RandomWalkFactory());
        panel.display();
    }
}
