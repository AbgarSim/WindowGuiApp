package core;

import core.gui.JFrameManager;
import core.gui.panels.FirstPanel;
import core.gui.panels.SecondPanel;

import javax.swing.*;

public class Main {

    private static JFrame frame;

    private static Main main;

    public static Main getInstance(){
        if(main == null){
            main = new Main();
        }
        return main;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        Main.frame = frame;
    }

    public static void main(String[] args) {
        frame = new JFrame ("First frame");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new FirstPanel(frame));
        frame.pack();
        frame.setVisible (true);
        JFrameManager.getInstance().addFrame(frame);
    }
}
