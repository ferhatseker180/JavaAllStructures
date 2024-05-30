package week4.JavaOOPAndGenerics.src.oop.Polymorphism;

public class Movie {

    private String title;

    Movie(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        // We are taking our class name
        System.out.println(title + " is a " + instanceType + " film");
    }
}
