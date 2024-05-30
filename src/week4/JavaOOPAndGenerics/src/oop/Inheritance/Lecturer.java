package week4.JavaOOPAndGenerics.src.oop.Inheritance;

public class Lecturer extends Academician{
    private int doorNumber;

    Lecturer(String nameSurname, String phoneNumber, String gmail, String department, String title, int doorNumber) {
        super(nameSurname, phoneNumber, gmail, department, title);
        this.doorNumber = doorNumber;
    }

    public void senateMeeting(){
        System.out.println(this.getNameSurname() + " door number " + this.doorNumber + " enter the senate meeting " );
    }
    public void makeExam(){
        System.out.println(this.getNameSurname() + " wants to make exam!!");
    }
}
