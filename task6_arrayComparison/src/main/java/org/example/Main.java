//İki array, ikisinin de 10 elementi olucak, bütün elementler random verilicek.
//iki array karşılaştırıp x arrayın de olup y elementinde olmayanlar yazılıcak.
//Tam tersi, ve ikisinde de ortak olan elementler alınıcak.

package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(50);
        }
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextInt(50);
        }
        String firstArray = Arrays.toString(array1);
        System.out.println("Birinci dizi : " + firstArray);

        String secondArray = Arrays.toString(array2);
        System.out.println("İkinci dizi : " + secondArray);

        Set<Integer> Elements = new HashSet<>();

        for (int num1 : array1) {
            Elements.add(num1);
        }

        List<Integer> common = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();
        List<Integer> unique1 = new ArrayList<>();

        for (int num : array2) {
            if (Elements.contains(num)) { //contains methodu ile var mı? demiş olduk
                common.add(num);
            }
            else {
                unique2.add(num); //array1 de yoksa array2 için eşsiz olan veriler unique2'ye eklenmiş oldu
            }
        }
        for (int number : array1) {
            if (!common.contains(number)) { //commonda olan verileri kontrol ederek array1 için ortak olmayan verileri ayıklamış oldum
                unique1.add(number);
            }
        }

        System.out.println("Ortak Sayı : " + common);
        System.out.println("Birinci dizide olupta birinci dizide olmayan sayılar : " + unique1);
        System.out.println("İkinci dizide olupta birinci dizide olmayan sayılar : " + unique2);
    }
}

//Elemanlar tek tek gezilerekte yazılabilir aşağıdaki kod uygulanarak;

         /*for (int num : notCommon) {
            System.out.println("İkinci dizide olupta birinci dizide olmayan sayı : " + num);
        }*/
        /*for (int num : common) {
            System.out.println("Ortak Sayı : " + num);
        }*/

//çıktı da çok alan kapladığı için ArrayList olarak yazdırdım.