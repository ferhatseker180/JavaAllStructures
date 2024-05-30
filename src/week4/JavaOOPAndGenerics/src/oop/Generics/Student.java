package week4.JavaOOPAndGenerics.src.oop.Generics;

public class Student <T> implements GenericInterface <T>{


    @Override
    public boolean insert(T data) {
        System.out.println("Veri Eklendi!");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri Silindi!");
        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri Güncellendi!");
        return false;
    }

    @Override
    public T select() {
        System.out.println("Veri Çekildi!");
        return null;
    }
}
