package week4.JavaOOPAndGenerics.src.oop.Abstraction;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf","Big",15.0); // Output: Howling!
        dog.makeNoise();
        dog.move("slow"); //Wolf is walking
        // New Output: Dog (Wolf) is walking

        Fish fish = new Fish("Goldfish","Medium",0.58);
        fish.makeNoise(); // Output: swish!
        fish.move("slow"); // Output: Goldfish is lazily swimming
        // New output : Fish (Goldfish) is lazily swimming

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Pitbull","Big",20.0));
        animals.add(fish);
        animals.add(new Fish("Shark","Very Big",850.0));

        for (Animal animal : animals){
            System.out.println("****************");
            System.out.println(animal.type);
        }

    }
}
