package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Şefaat Durmaz ", " 20010101034");
        map.put("Yavuz Selim Kavasoğlu ", " 20010101061");
        map.put("Mervenur Topçu ", " 20010101053");
        map.put("Şevval Çubuk ", " 20010101019");
        map.put("Yusuf Enes Demirhan ", " 20010101041");

        System.out.println("Map Elements :");
        System.out.println("\t" + map);
    }
}