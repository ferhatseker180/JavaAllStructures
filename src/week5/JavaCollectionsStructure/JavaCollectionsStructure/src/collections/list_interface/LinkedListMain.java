package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {

        // Linked list adresleme mantığıyla çalışır yani sağındaki ve solundaki değerleri referans alarak yerini tutar.
        // Hem List Interface'inden hem de Queue Interface'inden kalıtım alırlar.
        // Bir listenin ortasından, sonunda vs veri eklenip çıkartılacaksa Linked List yapısı Array List yapısına göre daha verimlidir.
        List<String> linked = new LinkedList<>();
        linked.add("Monday");
        linked.add("Tuesday");
        linked.add("Wednesday");
        linked.add("Thursday");

        System.out.println("Element of 2 index: " + linked.get(2) ); // Output : Wednesday
        linked.remove("Monday"); // linked.remove(index) şeklinde de kullanılabilir.
        System.out.println(linked.get(0)); // New Output : Tuesday
    }
}
