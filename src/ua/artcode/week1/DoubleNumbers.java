package ua.artcode.week1;

    // 4.4. Вводим число с плавающей точкой с консоли,
    // и проверяем лежит ли оно в диапазоне от 0 до 1

import javax.swing.*;

public class DoubleNumbers {
    public static void main(String[] args) {
        String question = JOptionPane.showInputDialog("Введите число с плавающей точкой");
        double x = Double.parseDouble(question);
        if (x >= 0.0 && x <= 1.0) {
            System.out.println("yes");
            System.exit(0);
        }
    }
}
