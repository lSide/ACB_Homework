package ua.artcode.week1;

    // 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
	//	в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

import javax.swing.*;

public class TrueFalse {
    public static void main(String[] args) {
        String question1 = JOptionPane.showInputDialog("Введите число а");
        int a = Integer.parseInt(question1);
        String question2 = JOptionPane.showInputDialog("Введите число b");
        int b = Integer.parseInt(question2);

        boolean res = a % b == 0;
        int d = a % b;
        System.out.println(res);
         if (a % b == 0) {
             System.out.println(a / b);
         } else {
            if (a % b != 0) {
                System.out.println(a / b + " " + d);
             }
         }

    }
    }
