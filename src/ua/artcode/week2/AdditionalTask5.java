package ua.artcode.week2;

/* 2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку
// "array is a data type" -> "@rr@y is @ d@t@ type"
 */

import java.util.Scanner;

public class AdditionalTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = sc.nextLine();
        System.out.println("Enter the char");
        String yourChar = sc.next();
        String newText = "";


        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(yourChar)) {
                newText = newText + text.substring(newText.length(), i) + "@";
            }
        }

        if (newText.length() < text.length()){
            newText += text.substring(newText.length(), text.length());
        }

        System.out.println(newText);
    }
}
