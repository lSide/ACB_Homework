package ua.artcode.week1;

/* 5.3. Посчитать сколько раз встречается символ 8 в заданном числе,
которое вводит юзер */


import java.util.Scanner;

public class AdditionalTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();
        int res = 0;

        while (number > 10) {
            if (number % 10 == 8) {
                res++;
            }
            number /= 10;
        }

        System.out.println(res);
    }
}
