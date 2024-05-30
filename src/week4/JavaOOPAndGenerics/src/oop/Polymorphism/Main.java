package week4.JavaOOPAndGenerics.src.oop.Polymorphism;

public class Main {
    public static void main(String[] args) {

      //  Movie movie = new Movie("Avatar");
      //  movie.watchMovie(); // Output: Avatar is a Movie film

       // Adventure adventure = new Adventure("Star Wars");
      //  adventure.watchMovie(); // Star Wars is not only Movie, Star Wars is a Adventure Movie

        // Polymorphism :
        Movie movie = new Adventure("Avatar");
        movie.watchMovie(); // Output: Avatar is not only Movie, Avatar is a Adventure Movie

        Movie movie1 = new Comedy("Big Bang Theory");
        movie1.watchMovie(); // Output : Big Bang Theory is a nice comedy film. You will burst into laughter

    }
}
