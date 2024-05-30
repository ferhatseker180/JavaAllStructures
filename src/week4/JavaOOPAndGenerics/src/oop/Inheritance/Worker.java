package week4.JavaOOPAndGenerics.src.oop.Inheritance;

public class Worker {
    private String nameSurname;
    private String phoneNumber;
    private String gmail;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    Worker(String nameSurname, String phoneNumber, String gmail){
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public void entry(){
        System.out.println(this.nameSurname + " Enter The University!!");
    }

    public void  exit(){
        System.out.println(this.nameSurname + " Exit The University!!");
    }

    public void diningHall(){
        System.out.println(this.nameSurname + " Enter The Dining Hall!!");
    }

}
