package ua.artcode.week1;

    // 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение,
    // если число делится на 7 нацело.

import javax.swing.*;

public class RemainderOfTheDivision {
    public static void main(String[] args) {
        String question = JOptionPane.showInputDialog("Введите число");
        int x = Integer.parseInt(question);
        if (x % 7 == 0) {
            System.out.println(x * 2);
        } else {
            if (x % 7 != 0) {
                System.out.println("none");
            }
        }

    }
}
