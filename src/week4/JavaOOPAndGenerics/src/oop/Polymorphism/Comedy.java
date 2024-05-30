package week4.JavaOOPAndGenerics.src.oop.Polymorphism;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
      //  super.watchMovie();
        System.out.println(getTitle() + " is a nice comedy film. You will burst into laughter");
    }
}
