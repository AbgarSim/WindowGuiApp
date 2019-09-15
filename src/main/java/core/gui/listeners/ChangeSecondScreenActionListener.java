package core.gui.listeners;

import core.gui.JFrameManager;
import core.gui.panels.FirstPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeSecondScreenActionListener implements ActionListener {

    private JFrame oldPanel;
    private JFrameManager frameManager = JFrameManager.getInstance();
    private String newPanelName;

    public ChangeSecondScreenActionListener(JFrame oldPanel, String newPanelName) {
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
        newFrame.getContentPane().add(new FirstPanel(newFrame));
        newFrame.pack();
        newFrame.setVisible(true);
        frameManager.pushFrame(newFrame);
    }
}