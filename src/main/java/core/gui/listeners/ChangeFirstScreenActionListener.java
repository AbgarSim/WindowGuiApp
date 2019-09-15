package core.gui.listeners;

import core.Main;
import core.gui.JFrameManager;
import core.gui.panels.FirstPanel;
import core.gui.panels.SecondPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeFirstScreenActionListener implements ActionListener {

    private JFrame oldPanel;
    private String newPanelName;

    private JFrameManager frameManager = JFrameManager.getInstance();

    public ChangeFirstScreenActionListener(JFrame oldPanel, String newPanelName) {
        this.oldPanel = oldPanel;
        this.newPanelName = newPanelName;
    }

    public void actionPerformed(ActionEvent e) {
        oldPanel.setVisible(false);
        JFrame newFrame = frameManager.getFrame(newPanelName);
        if(newFrame == null){
            newFrame = frameManager.createFrame(newPanelName);
        }
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.getContentPane().add(new SecondPanel(newFrame));
        newFrame.pack();
        newFrame.setVisible(true);
        frameManager.pushFrame(newFrame);
    }
}
