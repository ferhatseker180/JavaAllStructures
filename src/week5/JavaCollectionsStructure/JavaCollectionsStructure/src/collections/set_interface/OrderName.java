package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.set_interface;

import java.util.Comparator;

public class OrderName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
