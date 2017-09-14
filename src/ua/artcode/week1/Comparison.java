package ua.artcode.week1;

    // 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)

import javax.swing.*;

public class Comparison {
    public static void main(String[] args) {
        String question1 = JOptionPane.showInputDialog("Введите число а");
        int a = Integer.parseInt(question1);
        String question2 = JOptionPane.showInputDialog("Введите число b");
        int b = Integer.parseInt(question2);

        int c = (a % 10);
        int d = (b % 10);
        boolean r = c == d;

        System.out.println(r);

    }
}
