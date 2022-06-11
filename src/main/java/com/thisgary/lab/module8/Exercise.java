package com.thisgary.lab.module8;

import javax.swing.*;
import java.awt.*;

/* Exercise
Create a simple GUI to change the type of font when end user point of specific radio button.
 */

public class Exercise extends JFrame {
    JPanel p1, p2;
    JTextField t;
    JRadioButton a, b;

    public Exercise() {
        super("Why Someone Singing In Room");

        p1 = new JPanel();

        t = new JTextField("Lorem Ipsum");
        t.setEditable(false);
        p1.add(t);

        add(p1, BorderLayout.NORTH);

        p2 = new JPanel();

        a = new JRadioButton("Serif");
        a.setSelected(true);
        a.addActionListener(ae -> {
            b.setSelected(false);
            t.setFont(new Font(Font.SERIF, Font.PLAIN, 11));
        });
        p2.add(a);

        b = new JRadioButton("Sans-serif");
        b.addActionListener(ae -> {
            a.setSelected(false);
            t.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        });
        p2.add(b);

        add(p2, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        Exercise e = new Exercise();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e.setSize(300, 120);
        e.setVisible(true);
    }
}
