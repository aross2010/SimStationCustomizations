package simStation;

import mvc.Model;

import java.util.List;


public class Simulation extends Model {
    protected static int clock = 0;
    protected static List<Agent> agents;

    public void start() {
        // TODO - calls populate
        populate();


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

    public Agent getNeighbor(Agent a, double radius) {
        // TODO - return a random agent that is a neighbor or null
        return null;
    }


    public void populate() {
        // TODO - creates all the agents - override in customization

    }

}
