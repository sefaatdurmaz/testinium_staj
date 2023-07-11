package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Metin giriniz : ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        char[] textArray = text.toCharArray();
        int arrayLength = textArray.length;

        if (arrayLength != 0)
            for (int i = arrayLength-1; i >= 0; i--) {
                System.out.print(textArray[i]);
        }
        else
            System.out.println("Metin girişi yapmadınız");

    }
}