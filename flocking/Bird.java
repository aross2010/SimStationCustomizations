package flocking;

import mvc.Utilities;
import simStation.Agent;
import simStation.Heading;

public class Bird extends Agent {
    private final int MAX_SPEED = 5;
    private final int RADIUS = 10;
    

    protected int speed;
    protected Heading heading;

    public Bird() {
        super();
        speed = Utilities.rng.nextInt(MAX_SPEED) + 1;
        heading = Heading.random();
    }

    @Override
    public void update() {
        Agent agent = world.getNeighbor(this, RADIUS);
        if (agent != null) {
            speed = ((Bird) agent).speed;
            heading = ((Bird) agent).heading;
            move(speed);
        }

    }

}
