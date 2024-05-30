package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        // Sıralama yapmaz, karışık şekilde veriler gelir amaç sıralamak değil key ile veriyi almaktır.
        Map<String ,String> capital = new HashMap<>();

        capital.put("Türkiye","Ankara");
        capital.put("Azerbaycan","Bakü");
        capital.put("ABD","Washington");
        capital.put("Rusya","Moskova");

        System.out.println(capital.get("Türkiye")); // Output : Ankara
        capital.remove("Rusya"); // Rusya ve başkenti silindi.
        for (String u : capital.keySet()){
            System.out.println(u); // Keyler alınır : ABD Azerbaycan Türkiye
        }
        for (String c : capital.values()){
            System.out.println(c); // Value alınır : Washington Bakü Ankara
        }

    }
}
