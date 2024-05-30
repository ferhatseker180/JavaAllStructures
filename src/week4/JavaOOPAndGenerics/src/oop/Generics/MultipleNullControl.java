package week4.JavaOOPAndGenerics.src.oop.Generics;

public class MultipleNullControl <T1,T2,T3>{
    private  T1 value1;
    private  T2 value2;
    private  T3 value3;

    public MultipleNullControl(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void showInfo(){
        System.out.println("T1: " + value1.getClass().getSimpleName());
        System.out.println("T2: " + value2.getClass().getSimpleName());
        System.out.println("T3: " + value3.getClass().getSimpleName());
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public void setValue2(T2 value2) {
        this.value2 = value2;
    }

    public void setValue3(T3 value3) {
        this.value3 = value3;
    }

    public T2 getValue2() {
        return value2;
    }

    public T3 getValue3() {
        return value3;
    }
}
