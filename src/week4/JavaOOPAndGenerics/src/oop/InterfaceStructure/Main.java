package week4.JavaOOPAndGenerics.src.oop.InterfaceStructure;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        // Kuş 4 farklı türle anılabilmiş oldu.

        animal.move();
//        flier.move();
        flier.takeOff(); // Output: Bird is taking off
        flier.fly(); // Output: Bird is flying
        tracked.track(); // Output: Bird is coordinates recorded
        flier.land(); // Output: Bird is landing
    }
}
