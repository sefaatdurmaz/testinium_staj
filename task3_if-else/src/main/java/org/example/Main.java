//kullanıcıdan 1-7 arasında rakam alınacak ve girdiği rakama gelen haftanın günü yazacağız.
// girdi: 2, çıktı : salı 1-7 arasında değer girmezse "hatalı girdi" diyecek

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : " );
        int number = scanner.nextInt();

        if(1<=number && number <= 7) {
            if (number == 1) {
                System.out.println("Pazartesi");
            }
            if (number == 2) {
                System.out.println("Salı");
            }
            if (number == 3) {
                System.out.println("Çarşamba");
            }
            if (number == 4) {
                System.out.println("Perşembe");
            }
            if (number == 5) {
                System.out.println("Cuma");
            }
            if (number == 6) {
                System.out.println("Cumartesi");
            }
            if (number == 7) {
                System.out.println("Pazar");
            }
        }
        else
            System.out.println("Hatalı giriş");
    }
}