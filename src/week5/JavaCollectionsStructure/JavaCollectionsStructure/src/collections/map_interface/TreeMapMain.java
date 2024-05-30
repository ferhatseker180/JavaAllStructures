package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.map_interface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {

        Map<String,String> tree = new TreeMap<>(new OrderByAlphabet().reversed());

        tree.put("TR","Ankara");
        tree.put("ARJ","Buenos Aires");
        tree.put("BRZL","Brazilya");

        for (String cap : tree.values()){
            System.out.println(cap); // Output : Ankara Brazilya Buenos Aires
        }
    }
}
