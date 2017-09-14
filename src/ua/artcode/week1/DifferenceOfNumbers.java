package ua.artcode.week1;

    // 		4.5. Вводим 2 числа. Если первое число больше второго,
    // то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

import javax.swing.*;

public class DifferenceOfNumbers {
    public static void main(String[] args) {

        String question1 = JOptionPane.showInputDialog("Введите число а");
        double a = Double.parseDouble(question1);
        String question2 = JOptionPane.showInputDialog("Введите число b");
        double b = Double.parseDouble(question2);
        if (a > b) {
            System.out.println(a / b);
        } else {
            if (b > a) {
                System.out.println(a * b);
            }
        }
    }
}
