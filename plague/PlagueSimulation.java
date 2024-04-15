package plague;

import mvc.Utilities;
import simStation.Agent;
import simStation.Simulation;
import mvc.AppPanel;
import simStation.SimulationPanel;

public class PlagueSimulation extends Simulation {

    public static int VIRULENCE = 50; // % chance of infection
    public static int RESISTANCE = 2; // % chance of resisting infection
    public static int INITIALINFECTED = 50; //chance of a plague agent to be initially infected
    public void populate() {
        for (int i = 1; i < 21; i++) {
            Plague plagueAgent = new Plague();
            addAgent(plagueAgent);
            if ((Utilities.rng.nextInt(100) + 1) <= INITIALINFECTED)
            {
                plagueAgent.setInfected(true);
            }

        }
    }
   public double percentInfected()
    {
      double hit = 0;
      double safe = 0;
      double percentHit = 0;
        for (Agent agent: agents)
       {
          Plague p = (Plague) agent;
          if (p.getInfected()) {
                hit++;
           }
           else
           {
               safe ++;
           }
           percentHit = (hit / (safe + hit)) * 100;
       }
        return percentHit;
   }
    public String[] getStats()
    {
        String[] stats = {"agents = " + String.valueOf(agents.size()), "clock = " + String.valueOf(clock), "Infected = %" + percentInfected()};
        return stats;
    }

    public static void main(String[] args) {
            AppPanel panel = new SimulationPanel(new PlagueFactory());
            panel.display();
    }
}