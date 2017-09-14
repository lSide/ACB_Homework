package ua.artcode.week1;

import javax.swing.*;

public class Two {
    public static void main(String[] args) {

        String question1 = JOptionPane.showInputDialog("введите число а");
        double a = Double.parseDouble(question1);
        String question2 = JOptionPane.showInputDialog("введите число б");
        double b = Double.parseDouble(question2);

        if (a > b) {
            System.out.println(a * b);
        } else {
            if (a < b) {
                System.out.println(a / b);
            }
        }
    }
}