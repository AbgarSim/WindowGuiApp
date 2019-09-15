package core;

import core.gui.JFrameManager;
import core.gui.panels.FirstPanel;
import core.gui.panels.IntroPanel;
import core.gui.panels.SecondPanel;
import core.mvc.controller.TestController;
import org.postgresql.Driver;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static JFrame frame;
    private static Main main;

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        frame = new JFrame("First frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new IntroPanel(frame));
        frame.pack();
        frame.setVisible(true);
        JFrameManager.getInstance().addFrame(frame);
    }
}
