package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (Integer number : arr){
            System.out.print(number + " "); // Output: 1 2 3
        }
      //  arr.add(0,7); // 0.indexe 7 yazar ve 0.indextekini 1.indekse kaydırır.
        System.out.println();
        System.out.println(arr.get(1)); // Output: 2
        System.out.println(arr.size()); // Output : 3
        System.out.println(arr.contains(1)); // Output : true

        List<Integer> arrSubList = arr.subList(0,2); // O.indexten başlar ve 2 eleman alıp diğer listeye atar.
        System.out.println(arrSubList); // Output: 1, 2


        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        for (Integer number : arr2){
            System.out.print(number + " "); // Output: 4 5 6
        }
        System.out.println();

       arr.addAll(arr2); // İki array'i birleştirdi.
        System.out.println(arr); // Output: 1, 2, 3, 4, 5, 6


    }
}
