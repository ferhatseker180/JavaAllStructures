package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.map_interface;

import java.util.Comparator;

public class OrderByAlphabet implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
