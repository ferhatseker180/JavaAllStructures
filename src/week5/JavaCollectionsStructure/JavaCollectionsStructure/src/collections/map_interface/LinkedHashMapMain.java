package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        // HashMap sınıfındaki gibi belirsiz sıralama yoktur, öngörülebilen bir sırada erişim sağlar.
        Map<String,String> city = new LinkedHashMap<>();
        city.put("TR","İzmir");
        city.put("GR","Berlin");
        city.put("USA","New York");

        for (String c : city.values()){
            System.out.println(c); // Output: İzmir Berlin New York (Sıralı şekilde geliyor)
        }
    }
}
