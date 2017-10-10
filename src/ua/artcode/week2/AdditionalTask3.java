package ua.artcode.week2;

/* 2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным) */

import java.util.Scanner;

public class AdditionalTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = sc.next();
        System.out.println("Enter the character");
        String lookChar = sc.next();
        int quantity = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(lookChar)) {
                quantity++;
            }
        }

        System.out.println(quantity);

    }
}
