package ua.artcode.week2;

/* 2.1 Инвертировать массив (без использования допольнительного массива) */

import ua.artcode.Utils.ArrayUtils;

import java.util.Scanner;

public class AdditionalTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter range");
        int range = sc.nextInt();
        int[] mas = ArrayUtils.generateMas(size, range);

        ArrayUtils.printArr(mas);

        int invertIndex = mas.length - 1;
        int indexValue = 0;

        for (int i = 0; i < mas.length / 2; i++) {
            indexValue = mas[i];
            mas[i] = mas[invertIndex];
            mas[invertIndex] = indexValue;
            invertIndex--;
        }

        ArrayUtils.printArr(mas);
    }
}
