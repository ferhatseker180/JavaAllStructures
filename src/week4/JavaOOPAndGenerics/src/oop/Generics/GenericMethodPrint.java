package week4.JavaOOPAndGenerics.src.oop.Generics;

public class GenericMethodPrint {

    public static <T> void printArray(T[] arr) {
        for (T i : arr){
            System.out.println(i);
        }
    }
}
