package core.gui.panels;


import core.Main;
import core.gui.JFrameManager;
import core.gui.listeners.ChangeFirstScreenActionListener;

import java.awt.*;
import javax.swing.*;

public class FirstPanel extends JPanel {

    private JFrameManager frameManager;

    private JFrame parent;
    private JMenuBar menuBar;
    private JLabel titleLabel;
    private JTextArea textAreaSmall;
    private JTextArea textAreaLarge;
    private JTextArea textAreaSmallest;
    private JCheckBox checkBox;
    private JButton addButton;

    public FirstPanel(JFrame parent) {
        //parent
        this.parent = parent;
        this.frameManager = JFrameManager.getInstance();
        frameManager.pushFrame(parent);

        //construct preComponents
        JMenu fileMenu = new JMenu("File");
        JMenuItem printItem = new JMenuItem("Print");
        fileMenu.add(printItem);
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        JMenu helpMenu = new JMenu("Help");
        JMenuItem contentsItem = new JMenuItem("Contents");
        helpMenu.add(contentsItem);
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        //construct components
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        titleLabel = new JLabel("Добавить фильм");
        textAreaSmall = new JTextArea("Заголовок фильма", 1, 5);
        textAreaLarge = new JTextArea("Описание фильма", 5, 5);
        textAreaSmallest = new JTextArea("Цена фильма", 5, 5);
        checkBox = new JCheckBox("Добавить субтитры");
        addButton = new JButton("Добавить");

        //adjust size and set layout
        setPreferredSize(new Dimension(723, 445));
        setLayout(null);

        //add listeners
        addButton.addActionListener(
                new ChangeFirstScreenActionListener(
                        parent, "Second frame")
        );

        //add components
        add(menuBar);
        add(titleLabel);
        add(textAreaSmall);
        add(textAreaLarge);
        add(textAreaSmallest);
        add(checkBox);
        add(addButton);

        //set component bounds (only needed by Absolute Positioning)
        menuBar.setBounds(0, 0, 915, 25);
        titleLabel.setBounds(205, 40, 335, 25);
        textAreaSmall.setBounds(205, 80, 335, 35);
        textAreaLarge.setBounds(205, 135, 335, 105);
        textAreaSmallest.setBounds(205, 260, 170, 40);
        checkBox.setBounds(395, 260, 145, 30);
        addButton.setBounds(270, 355, 200, 35);

        //Adjust alignments
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
}