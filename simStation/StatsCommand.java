package simStation;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

import static simStation.Simulation.getStats;

public class StatsCommand extends Command {

    public StatsCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() throws Exception {
        // TODO
        Utilities.inform(getStats());
    }

}
