package simStation;

import mvc.AppFactory;
import mvc.AppPanel;
import javax.swing.*;
import java.awt.*;

public class SimulationPanel extends AppPanel {

    public SimulationPanel(AppFactory factory) {
        super(factory);
        controlPanels.setLayout(new GridLayout(5, 1));

        JButton start = new JButton("Start");
        start.addActionListener(this);
        addControl(start);

        JButton suspend = new JButton("Suspend");
        suspend.addActionListener(this);
        addControl(suspend);

        JButton resume = new JButton("Resume");
        resume.addActionListener(this);
        addControl(resume);

        JButton stop = new JButton("Stop");
        stop.addActionListener(this);
        addControl(stop);

        JButton stats = new JButton("Stats");
        stats.addActionListener(this);
        addControl(stats);
    }

    private void addControl(JButton control){
        control.addActionListener(this);
        JPanel holder = new JPanel();
        holder.add(control);
        controlPanels.add(holder);
    }

}
