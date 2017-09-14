package ua.artcode.week1;

import java.util.Scanner;


import java.util.Scanner;
public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("input time");
        int time = sc.nextInt();
        System.out.println("input money");
        double money = sc.nextDouble();
        System.out.println("input name");
        String name = sc.next();
        System.out.println("input energy");
        boolean energy = sc.nextBoolean();
        System.out.println("input productName");
        String productName = sc.next();
        System.out.println("input productPrice");
        double productPrice = sc.nextInt();


        boolean timeLogicRes = !(time >= 24 && time < 8);
        boolean moneyLogicRes = money >= productPrice;

        boolean finalRes = timeLogicRes && moneyLogicRes
                                            && energy;

        String resultMessage = "Did you buy " + productName + " price "
                        + productPrice + "?\n" + finalRes;
        System.out.println(resultMessage);
    }
}
