package week4.JavaOOPAndGenerics.src.oop.Inheritance;

public class Officer extends Worker {
    private String department;
    private int workHours;

    Officer(String nameSurname, String phoneNumber, String gmail, String department, int workHours) {
        super(nameSurname, phoneNumber, gmail);
        this.department = department;
        this.workHours = workHours;
    }

    public void work(){
        System.out.println(this.getNameSurname() + " has been working in the " + this.department + " department" + " for " + this.workHours + " hours");
    }
}
