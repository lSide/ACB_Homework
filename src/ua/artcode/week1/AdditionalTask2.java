package ua.artcode.week1;

/* вычислить факториал числа */

import java.util.Scanner;

public class AdditionalTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int number = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
