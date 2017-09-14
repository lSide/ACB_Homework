package ua.artcode.week1;

    //4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
    // Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

import java.util.Scanner;
public class WhatTime {

    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        String message = "";

        System.out.println("Текущий час от 0 до 24");
        int time = sc.nextInt();
        if (time >= 9 && time < 18) {
            message = "я на работе";
        }
        else {
            if (time <9 || time >=18) {
                message = "я отдыхаю";
            }
        }
        System.out.println(message);
    }
}
