package ua.artcode.week1;

    // 4.2. Пользователь вводит три числа с консоли,
    // нужно вывести на консоль наибольшее, наименьшее

import java.util.Scanner;
public class ThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        System.out.println("Введите число c");
        int c = sc.nextInt();

        String theLargestNumber = "";
        String theLeastNumber = "";
        if (a > b && a > c) {
            theLargestNumber = a + " - наибольшее число ";
        } else {
            if (b > a && b > c) {
                theLargestNumber = b + " - наибольшее число ";
            } else {
                if (c > a && c > b) {
                    theLargestNumber = c + " - наибольшее число ";
                }
            }
        }
        if (a < b && a < c) {
            theLeastNumber = a + " - наименьшее число ";
        } else {
            if (b < a && b < c) {
                theLeastNumber = b + "- наименьшее число ";
            } else {
                if (c < a && c < b) {
                    theLeastNumber = c + " - наименьшее число ";
                }
            }
        }
        System.out.println(theLargestNumber + theLeastNumber);
    }
}





