package ua.artcode.week2;

/* 	2.2 Проверить или является число простым */

import java.util.Scanner;

public class AdditionalTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("This is not a prime number");
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    if (i == number) {
                        System.out.println("This is a prime number");
                    } else {
                        System.out.println("This is not a prime number");
                    }
                    break;
                }
            }

        }
    }
}
