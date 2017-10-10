package ua.artcode.week2;

/* 2.4 Сдвинуть массив на заданное количество позиций
// {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь */

import ua.artcode.Utils.ArrayUtils;

import java.util.Scanner;

public class AdditionalTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter range");
        int range = sc.nextInt();
        System.out.println("Enter position");
        int position = sc.nextInt();
        int[] mas = ArrayUtils.generateMas(size, range);
        int[] mas2 = new int[size];
        int last = 0;

        ArrayUtils.printArr(mas);

        for (int i = 0; i < mas.length + position; i++) {
            if (i + position < mas.length) {
                mas2[i + position] = mas[i];
            } else {
                mas2[last] = mas[mas.length - position];
                last++;
                position--;
            }
        }

        ArrayUtils.printArr(mas2);
    }
}
