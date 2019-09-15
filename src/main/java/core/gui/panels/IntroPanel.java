package core.gui.panels;

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {
    private JFrame parent;
    private JLabel jcomp1;
    private JButton jcomp2;
    private JLabel jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JButton jcomp8;
    private JLabel jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    private JLabel jcomp12;
    private JButton jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JButton jcomp16;

    public IntroPanel(JFrame parent) {
        this.parent = parent;
        //construct components
        jcomp1 = new JLabel("Посмотреть на всех существующих операторов");
        jcomp2 = new JButton("Посмотреть");
        jcomp3 = new JLabel("Посмотреть все предметы доступные на складах");
        jcomp4 = new JButton("Посмотреть");
        jcomp5 = new JButton("Посмотреть");
        jcomp6 = new JLabel("Посмотреть предметы на определённых складах");
        jcomp7 = new JLabel("Добавить предмет");
        jcomp8 = new JButton("Добавить");
        jcomp9 = new JLabel("Добавть склад");
        jcomp10 = new JButton("Добавить");
        jcomp11 = new JButton("Добавить ");
        jcomp12 = new JLabel("Добавить оператора");
        jcomp13 = new JButton("Добавить");
        jcomp14 = new JLabel("Добавить предмет на склад");
        jcomp15 = new JLabel("Посмотреть все доступные склады");
        jcomp16 = new JButton("Посмотреть");

        //adjust size and set layout
        setPreferredSize(new Dimension(704, 477));
        setLayout(null);

        //add components
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);
        add(jcomp5);
        add(jcomp6);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        add(jcomp11);
        add(jcomp12);
        add(jcomp13);
        add(jcomp14);
        add(jcomp15);
        add(jcomp16);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(15, 15, 340, 35);
        jcomp2.setBounds(385, 15, 135, 30);
        jcomp3.setBounds(20, 70, 340, 30);
        jcomp4.setBounds(385, 65, 135, 30);
        jcomp5.setBounds(385, 115, 135, 30);
        jcomp6.setBounds(20, 120, 340, 40);
        jcomp7.setBounds(45, 275, 160, 35);
        jcomp8.setBounds(220, 275, 135, 30);
        jcomp9.setBounds(45, 315, 100, 25);
        jcomp10.setBounds(220, 315, 135, 30);
        jcomp11.setBounds(220, 355, 135, 30);
        jcomp12.setBounds(45, 355, 130, 30);
        jcomp13.setBounds(220, 395, 135, 30);
        jcomp14.setBounds(45, 395, 170, 30);
        jcomp15.setBounds(20, 175, 295, 25);
        jcomp16.setBounds(385, 165, 135, 30);
    }
}

