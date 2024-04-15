package plague;
import java.awt.Color;
import mvc.Utilities;
import simStation.Agent;
import simStation.Heading;

import java.awt.*;

public class Plague extends Agent
{


    boolean infected = false;
    public void setInfected(boolean infected)
    {
        this.infected = infected;
    }
    public boolean getInfected()
    {
        return infected;
    }
    public Plague() {
        super();
        heading = Heading.random();
    }
    public void update() {
        heading = Heading.random();
        int steps = Utilities.rng.nextInt(10) + 1;
        move(steps);
        // if (world.getNeighbor(Agent p, 5) != null) {
        if (infected)
        {
            color = Color.RED;
        }
        else
        {
            color = Color.GREEN;
        }

    }
}
