package simStation;

import mvc.Model;

import java.util.List;


public class Simulation extends Model {
    protected int clock = 0;
    protected List<Agent> agents;

    public void start() {
        // TODO - calls populate
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
