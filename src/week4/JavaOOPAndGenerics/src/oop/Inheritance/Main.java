package week4.JavaOOPAndGenerics.src.oop.Inheritance;

public class Main {
    public static void main(String[] args) {

        Academician academician = new Academician("Ferhat Şeker","12345678900","deneme180@gmail.com","Yazılım","Prof");
      //  academician.entry();
       // academician.enterLesson();
        Officer officer = new Officer("Ferhat Şeker","12345678901","deneme12@gmail.com","IT",50);
      //  officer.work();

        Lecturer lecturer = new Lecturer("Ferhat Şeker","12345698798","ferhat@gmail.com","EEM","Prof",13);
        lecturer.senateMeeting();
        lecturer.makeExam();
    }
}
