package week4.JavaOOPAndGenerics.src.oop.Inheritance;

public class Academician extends Worker {
    private String department;
    private String title;


    Academician(String nameSurname, String phoneNumber, String gmail, String department, String title) {
        super(nameSurname, phoneNumber, gmail);
        this.department = department;
        this.title = title;
    }

    public void enterLesson(){
        System.out.println(this.getNameSurname() + " Enter The Lesson!!");
    }

}
