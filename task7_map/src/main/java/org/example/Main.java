package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Şefaat Durmaz","20010101034");
        map.put("Yavuz Selim Kavasoğlu","20010101061");
        map.put("Mervenur Topçu","20010101053");
        map.put("Şevval Çubuk","20010101019");
        map.put("Yusuf Enes Demirhan","20010101041");

        boolean empty = map.isEmpty();
        System.out.println("Harita boş mu ? " + empty);

        String number = map.get("Şefaat Durmaz");
        System.out.println("Şefaat Durmaz'ın öğrenci numarası : " + number);

        boolean key = map.containsKey("Yavuz Selim Kavasoğlu");
        System.out.println("Yavuz Selim Kavasoğlu haritada var mı : " + key);

        boolean value = map.containsValue("20010101053");
        System.out.println("20010101053 numaralı kişi haritada var mı : " + value);

        int mapSize = map.size();
        System.out.println("Harita Boyutu: " + mapSize);

        Set<String> keySet = map.keySet(); //sadece keyleri yazdıracağımızda
        System.out.println("Anahtarlar: " + keySet);

        Collection<String> values =map.values(); //sadece value yazdıracağımızda
        System.out.println("Değerler : " + values);

        System.out.println("Map Elements :"); //böyle küme şeklinde yazdırıyor
        System.out.println(map);

        Set<Map.Entry<String,String>>entrySet = map.entrySet(); //böyle tek tek değer anahtar olarak yazdırır
        for (Map.Entry<String,String> entry : entrySet) {
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println("Anahtar : " + Key + "," + " Değer :" + Value);
        }

    }
}