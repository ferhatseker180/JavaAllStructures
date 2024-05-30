package week4.JavaOOPAndGenerics.src.oop.Abstraction;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            //  System.out.println(type + " is walking");
            // aşağıdaki gibi soyut metottaki fonksiyon çağrılabilir.
            System.out.println(getExplicitType() + " is walking");
        } else {
            //  System.out.println(type + " is running");
            System.out.println(getExplicitType() + " is running");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}
