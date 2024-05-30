package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListMain {
    public static void main(String[] args) {
        // LinkedListler polymorphism'e önemli bir örnektir çünkü hem List sınıfından hem de Queue sınıfından kalıtılırlar.

        Queue<String> que = new LinkedList<>();

        que.add("Pazartesi");
        que.add("Salı");
        que.add("Çarşamba");
        System.out.println(que.size()); // Output : 3
        System.out.println(que.element()); // Output : Pazartesi Yani ilk giren ilk çıktı FIFO
        System.out.println();
        que.offer("Perşembe"); // Elemanı kuyruğa ekler
        for (String q : que){
            System.out.print(q + " "); // Output: Pazartesi Salı Çarşamba Perşembe
        }
        System.out.println(que.poll());  // Kuyruğun başındaki elemanı verir ve sonra listeden siler.
        for (String q : que){
            System.out.print(q + " "); // Output: Salı Çarşamba Perşembe
        }
        System.out.println();
        System.out.println(que.peek()); // Peek() kuyruğun başındaki elemanı verir ama elemanı silmez.
        for (String q : que){
            System.out.print(q + " "); // Output: Salı Çarşamba Perşembe
        }
       // que.add(null); // Null değer alabiliyor
    }
}
