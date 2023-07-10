package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("20010101034","Şefaat Durmaz");
        map.put("20010101061","Yavuz Selim Kavasoğlu");
        map.put("20010101053","Mervenur Topçu");
        map.put("20010101019","Şevval Çubuk");
        map.put("20010101041","Yusuf Enes Demirhan");

        String studentNumber = "20010101041";
        String student = map.get(studentNumber);


        if (student != null) {
            map.remove(studentNumber);
            System.out.println("Öğrenci silindi");
        }
        else
            System.out.println("Öğrenci bulunamadı");

        System.out.println("Güncellenmiş durum : " + map);
    }
}