package week4.JavaOOPAndGenerics.src.oop.Polymorphism;

public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
       // super.watchMovie();
        System.out.println(getTitle() + " is not only Movie, " + getTitle() + " is a Adventure Movie");
    }
}
