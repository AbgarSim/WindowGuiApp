package core.gui.panels;

import core.Main;
import core.gui.listeners.ChangeScreenActionListener;

import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel {
    private JLabel titleLabel;
    private JButton addButton;
    private JCheckBox checkBox;
    private JLabel priceLabel;
    private JTextField from;
    private JTextField to;
    private JComboBox<String> dropDown;

    public SecondPanel() {
        //construct preComponents
        String[] dropDownItems = {"Item 1", "Item 2", "Item 3"};

        //construct components
        titleLabel = new JLabel ("Фильмы");
        addButton = new JButton ("Добавить");
        checkBox = new JCheckBox ("Доступны субтитры");
        priceLabel = new JLabel ("Цена");
        from = new JTextField (5);
        to = new JTextField (5);
        dropDown = new JComboBox<String>(dropDownItems);

        //adjust size and set layout
        setPreferredSize (new Dimension(714, 447));
        setLayout (null);

        //add listeners
        addButton.addActionListener(
                new ChangeScreenActionListener(
                        Main.getInstance().getFrame(),
                        new JFrame ("First"),
                        FirstPanel.class));

        //add components
        add (titleLabel);
        add (addButton);
        add (checkBox);
        add (priceLabel);
        add (from);
        add (to);
        add (dropDown);

        //set component bounds (only needed by Absolute Positioning)
        titleLabel.setBounds (15, 30, 120, 30);
        addButton.setBounds (150, 30, 105, 30);
        checkBox.setBounds (270, 30, 150, 30);
        priceLabel.setBounds (430, 30, 55, 30);
        from.setBounds (485, 35, 30, 25);
        to.setBounds (525, 35, 30, 25);
        dropDown.setBounds (580, 35, 100, 25);

        //adjust alignments
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
