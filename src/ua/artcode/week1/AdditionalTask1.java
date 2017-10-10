package ua.artcode.week1;

/* 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот.
Пользователь сам вводит число */

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        String binNum = "";

        while (number > 0) {
            binNum += number % 2;
            number /= 2;
        }
        System.out.println(binNum);

        System.out.println("Enter binary number");
        String lastBinNum = sc.next();
        int res = 0;

        for (int i = 0; i < lastBinNum.length(); i++) {
            if (lastBinNum.charAt(i) == '1') {
                res += Math.pow(2, i) * 1;
            }
        }
        System.out.println(res);
    }


}

