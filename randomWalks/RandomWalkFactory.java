package randomWalks;

import simStation.SimStationFactory;
import mvc.Model;

public class RandomWalkFactory extends SimStationFactory {
    public Model makeModel() { return new RandomWalkSimulation(); }
    public String getTitle() { return "Random Walks";}
}
