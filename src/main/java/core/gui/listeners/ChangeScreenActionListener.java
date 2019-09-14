package core.gui.listeners;

import core.Main;
import core.gui.panels.SecondPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeScreenActionListener implements ActionListener {

    private JFrame oldPanel;
    private JFrame newPanel;
    private Class panel;

    public ChangeScreenActionListener(JFrame oldPanel, JFrame newPanel, Class panelToChange) {
        this.oldPanel = oldPanel;
        this.newPanel = newPanel;
        this.panel = panelToChange;
    }

    public void actionPerformed(ActionEvent e) {
        oldPanel.setVisible(false);
        newPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            newPanel.getContentPane().add((JPanel) panel.newInstance());
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        newPanel.pack();
        newPanel.setVisible(true);
        Main.getInstance().setFrame(newPanel);
    }
}
