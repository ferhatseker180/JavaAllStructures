package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.set_interface;

public class Student {
    private String name;
    private int note;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
