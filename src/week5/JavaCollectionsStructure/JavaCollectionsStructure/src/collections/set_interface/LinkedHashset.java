package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {

        LinkedHashSet<String> linked = new LinkedHashSet<>();

        linked.add("Monday");
        linked.add("Tuesday");
        linked.add("Wednesday");
        linked.add("Thursday");
        linked.add("Friday");
        linked.add("Saturday");
        linked.add("Sunday");

        // LinkedHashSet'de önce giren önce çıkar yani hangi eleman ilk eklendiyse önce o çıkar.
        // HashSet'deki gibi kendini tekrar eden elemanlara izin vermez.
        // Linked yapısının çalışma mantığı bir önceki elemanın ve bir sonraki elemanın yerini hafızasında tutmasına dayanır yani düğüm mantığı gibi.
        System.out.println(linked.size()); // OUTPUT : 7

        for (String day : linked) {
            System.out.print(day + " "); // OUTPUT : Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        }
    }
}
