package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.list_interface;

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        // Array sınıfına çok benzer ancak Array gibi sabit bir boyuta sahip değildir yani boyutu sonradan değiştirilebilir, Arraylist'e benzerdir.
        // ArrayList, Vector sınıfına göre daha hızlıdır ancak Vector sınıfı çoklu işlemler için daha güvenlidir.

        List<String> vector = new Vector<>();

        vector.add("İzmir");
        vector.add("İstanbul");
        vector.add("Ankara");
        vector.add("Bursa");
        vector.add("Manisa");

        vector.add(3,"Kocaeli"); // 3.index'e Kocaeli eklenir ve Bursa 4.indise geçer.
        System.out.println(vector.size()); // Output: 6
        System.out.println(vector.get(0)); // Output: İzmir

    }
}
