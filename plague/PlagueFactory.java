package plague;

import mvc.Model;
import randomWalks.RandomWalkSimulation;
import simStation.SimStationFactory;

public class PlagueFactory extends SimStationFactory
{
    public Model makeModel() { return new PlagueSimulation(); }
    public String getTitle() { return "Plague";}
}
