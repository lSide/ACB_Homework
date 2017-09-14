package ua.artcode.week1;

    // 4.6. Вводим два числа, вывести их суму,
    // если она в диапазоне от 11 до 19.

import javax.swing.*;

public class SumOfNumbers {
    public static void main(String[] args) {

        String question1 = JOptionPane.showInputDialog("Введите число а");
        int a = Integer.parseInt(question1);
        String question2 = JOptionPane.showInputDialog("Введите число b");
        int b = Integer.parseInt(question2);
        int c = a * b;

        if (c >= 11 && c <= 19) {
            System.out.println(c);
        }

    }
}

