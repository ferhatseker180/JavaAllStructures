package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.set_interface;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {

       // NavigableSet<Student> student = new TreeSet<>(new OrderNote());
        NavigableSet<Student> student = new TreeSet<>(new OrderName());

        student.add(new Student("Ferhat",100));
        student.add(new Student("Ahmet",50));
        student.add(new Student("Mehmet",70));
        student.add(new Student("Bahtiyar",40));
        student.add(new Student("Mustafa",90));
        student.add(new Student("Ahmet",50));

      //  for (Student stu : student){
       //     System.out.println(stu.getName()); // Output : Bahtiyar Ahmet Mehmet Mustafa Ferhat Notları düşük olandan yüksek olana doğru
      //  }

        for (Student stu : student){
            System.out.println(stu.getName()); // Output: Ahmet Bahtiyar Ferhat Mehmet Mustafa (isim sıralamasına göre)
        }
    }
}
