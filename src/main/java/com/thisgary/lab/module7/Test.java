package com.thisgary.lab.module7;

import com.thisgary.library.Dumpster;
import com.thisgary.library.GetNumber;

import javax.swing.*;

public class Test {
    public static void activity1() {
        int x = GetNumber.jopInt("Enter a number: ", "Input");
        int y = GetNumber.jopInt("Enter another number: ", "Input");
        Division d = new Division(x, y);
        JOptionPane.showMessageDialog(null, d, "Division", JOptionPane.PLAIN_MESSAGE);
    }

    public static void activity2() {
        boolean tryThis = true;
        int i = 0;
        while (tryThis) {
            int x = GetNumber.jopInt("Enter a number: ", "Input");
            int y = GetNumber.jopInt("Enter another number: ", "Input");
            Division d = new Division(x, y);
            try {
                JOptionPane.showMessageDialog(
                        null, d, "Try 0", JOptionPane.DEFAULT_OPTION);
                if (++i > 3)
                    JOptionPane.showMessageDialog(
                            null, "DO WHAT TITLE TOLD YOU OR I TRAP YOU IN LOOP, thank you.",
                            "Try 0", JOptionPane.DEFAULT_OPTION
                    );
            } catch (ArithmeticException e) {
                tryThis = false;
                JOptionPane.showMessageDialog(
                        null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                if (i > 3)
                    JOptionPane.showMessageDialog(
                            null, "", "Good Job", JOptionPane.ERROR_MESSAGE,
                            new ImageIcon("src/main/resources/images/heh.jpg"));
            }
        }
    }

    public static void activity3() {
        throw new ZeroDivisionException(); // why not
    }

    public static void main(String[] args) {
        Dumpster.testModule(7);
    }
}
