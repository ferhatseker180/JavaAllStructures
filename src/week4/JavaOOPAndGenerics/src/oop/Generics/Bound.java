package week4.JavaOOPAndGenerics.src.oop.Generics;

public class Bound <T extends Number> {
    private final T value;

    public Bound(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır!! (Null)");
        } else {
            System.out.println(this.value);
        }
    }
}
