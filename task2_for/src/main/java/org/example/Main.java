//random bir int sayı tutacak yazılım, kullanıcının 3 tahmin hakkı olacak.
//doğru bilirse bildiniz diyip bitecek. bilemezse 2 hakkınız, 1 hakkınız kaldı diye tekrar girmesini istiyecek.

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 23;
        int guess;
        int i;

        for (i=1;i<=3;i++) {

            System.out.println("Tahmininizi giriniz : ");
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Bildiniz");
            }
            else {
                System.out.println("Bilemediniz " + (3-i) + " hakkınız kaldı");
            }
        }
    }
}

