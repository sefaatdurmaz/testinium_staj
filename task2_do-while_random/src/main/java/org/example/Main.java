package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int i = 1;

        do {
            System.out.println("Tahmininizi giriniz : ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Bildiniz");
                break;
            }
            else {
                System.out.println("Bilemediniz " + (3-i) + " hakkınız kaldı");
                i++;
            }

        } while (i<=3);
    }
}
