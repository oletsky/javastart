package javatraining.oletsky.javastart;

import javax.swing.*;

/**
 * Input-output by Swing
 */
public class InputBySwing {
    public static void main(String[] args) {
        String inp = JOptionPane.showInputDialog
                ("Enter the string");
        JOptionPane.showMessageDialog(null,
                "You entered: "+inp,
                "Information",
                JOptionPane.INFORMATION_MESSAGE,
                null);
        System.out.println("You entered: "+inp);


    }

}
