package week4.JavaOOPAndGenerics.src.oop.Generics;

public class Main {
    public static void main(String[] args) {

        Integer number = null;
        // Integer için Generic Veri Tipiyle Null Kontrolü
        Nullable<Integer> n = new Nullable<>(number);
        n.run();

        // String için Generic Veri Tipiyle Null Kontrolü
        String str = null;
        Nullable<String> s = new Nullable<>(str);
        s.run();

        // Birden fazla Generic Veri Tipinin Null Kontrolü
        Double d = null;
        MultipleNullControl<Integer,String,Double> values = new MultipleNullControl<>(10,"Ferhat",5.2);
       // values.showInfo();

        Student <String> st = new Student<>();
       // st.insert("Ferhat");

        // Bounded: <T> içerisi Bound sınıfında extends Number() yapılarak sadece Number türevleriyle sınırlandırıldı.
        Bound <Integer> n1 = new Bound<>(50);
        n1.run();
    }
}
