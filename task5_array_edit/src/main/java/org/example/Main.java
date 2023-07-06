package org.example;

public class Main {
    public static void main(String[] args) {

        String text = "21, 43, 65, 64, 43, 76, 23";
        String[] array = text.split(",");

        int len = array.length;
        int i = 0;
        while (i<=7) {
            System.out.println(i);
            i++;
        }
        System.out.println("Array'in uzunluğu : " + array.length);
        System.out.println("Array'in ilk elemanı : " + array[0]);
        System.out.println("Array'in 2. elemanı : " + array[1]);
        System.out.println("Array'in 3. elemanı : " + array[2]);
        System.out.println("Array'in 4. elemanı : " + array[3]);
        System.out.println("Array'in 5. elemanı : " + array[4]);
        System.out.println("Array'in 6. elemanı : " + array[5]);
        System.out.println("Array'in son elemanı : " + array[len-1]);

    }
}
