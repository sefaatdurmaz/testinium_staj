package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int len = numbers.length;

        System.out.println("Array'ın ilk elemanı : " + numbers[0]);
        System.out.println("Array'ın son elemanı : " + numbers[len-1]);
        System.out.println("Array'ın uzunluğu : " + numbers.length);
    }
}