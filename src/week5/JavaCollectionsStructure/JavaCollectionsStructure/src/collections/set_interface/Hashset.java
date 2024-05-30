package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet.add("ilk");
        hashSet.add("ikinci");
        hashSet.add("dördüncü");
        hashSet.add("ucuncu");
        hashSet.add(null); // HashSet içerisine null değer atanabilir.

        hashSet2.add(3);
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(5);


        for (String text : hashSet){
        //    System.out.print(text + " "); // Output: null ilk ucuncu ikinci dördüncü
        }

       // System.out.println(hashSet.contains("İkinci")); // Contains'in true dönmesi için tüm metni içermeli yani iki yazarsak false döner.
       // System.out.println(hashSet.size());

      //  hashSet2.remove(5);
        for (Integer number : hashSet2){
        //    System.out.print(number + " "); // Output: 1 2 3
        }

        Iterator<Integer> itr = hashSet2.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " "); // Output: 1 2 3 5
        }

    }
}
