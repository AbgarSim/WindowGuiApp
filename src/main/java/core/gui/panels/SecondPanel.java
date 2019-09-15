package core.gui.panels;

import core.Main;
import core.gui.JFrameManager;
import core.gui.listeners.ChangeFirstScreenActionListener;
import core.gui.listeners.ChangeSecondScreenActionListener;

import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel {

    private JFrame parent;
    private JFrameManager frameManager;

    private JLabel titleLabel;
    private JButton addButton;
    private JCheckBox checkBox;
    private JLabel priceLabel;
    private JTextField from;
    private JTextField to;
    private JComboBox<String> dropDown;
    private JTable dbTable;

    public SecondPanel(JFrame parent) {
        //parent
        this.parent = parent;
        frameManager = JFrameManager.getInstance();
        frameManager.pushFrame(parent);

        //construct preComponents
        String[] dropDownItems = {"Item 1", "Item 2", "Item 3"};



        // Column Names
        String[] columnNames = {"Name", "Roll Number", "Department"};

        // Data to be displayed in the JTable
        String[][] data = {
                columnNames,
                {"Kundan Kumar Jha", "4031", "CSE"},
                {"Anand Jha", "6014", "IT"}
        };

        //construct components
        titleLabel = new JLabel("Фильмы");
        addButton = new JButton("Добавить");
        checkBox = new JCheckBox("Доступны субтитры");
        priceLabel = new JLabel("Цена");
        from = new JTextField(5);
        to = new JTextField(5);
        dropDown = new JComboBox<String>(dropDownItems);
        dbTable = new JTable(data, columnNames);

        //adjust size and set layout
        setPreferredSize(new Dimension(714, 447));
        setLayout(null);

        //add listeners
        addButton.addActionListener(
                new ChangeSecondScreenActionListener(
                        parent, "First frame"
                ));

        //add components
        add(titleLabel);
        add(addButton);
        add(checkBox);
        add(priceLabel);
        add(from);
        add(to);
        add(dropDown);
        add(dbTable);

        //set component bounds (only needed by Absolute Positioning)
        titleLabel.setBounds(15, 30, 120, 30);
        addButton.setBounds(150, 30, 105, 30);
        checkBox.setBounds(270, 30, 150, 30);
        priceLabel.setBounds(430, 30, 55, 30);
        from.setBounds(485, 35, 30, 25);
        to.setBounds(525, 35, 30, 25);
        dropDown.setBounds(580, 35, 100, 25);
        dbTable.setBounds(45, 80, 635,300);

        //adjust alignments
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
