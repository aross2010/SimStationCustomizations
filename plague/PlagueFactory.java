package plague;

import mvc.Model;
import mvc.View;
import randomWalks.RandomWalkSimulation;
import simStation.SimStationFactory;
import simStation.SimulationView;

public class PlagueFactory extends SimStationFactory
{
    public Model makeModel() { return new PlagueSimulation(); }
    public String getTitle() { return "Plague";}
    public View makeView(Model model) {
        return new PlagueView(model);
    }
}
