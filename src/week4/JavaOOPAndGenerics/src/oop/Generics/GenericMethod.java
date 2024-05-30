package week4.JavaOOPAndGenerics.src.oop.Generics;

public class GenericMethod {
    public static void main(String[] args) {
        String[] a = {"Java", "Kotlin", "React Native"};
        Integer[] b = {1, 3, 5, 7};
        Character[] c = {'F', 'E', 'R', 'H'};

        /*
       for (String i : a){
           System.out.println(i);
       }

         */

        // Burada farklı tipteki tüm arraylerimi tek bir fonksiyon içerisinde kontrol edip yazdırabilirim.
        GenericMethodPrint.printArray(c);

    }
}
