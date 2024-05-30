package week4.JavaOOPAndGenerics.src.oop.Generics;

public class Nullable <T> {

    private final T value;

    public T getValue() {
        return value;
    }

    public Nullable(T value) {
        this.value = value;
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
