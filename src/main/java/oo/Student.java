package oo;

public class Student extends Person {
    private Klass klass;  // The class the student belongs to

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    // Method to set or change the class the student belongs to
    public void join(Klass klass) {
        this.klass = klass;
    }

    // Method to check if the student belongs to a particular class
    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.equals(klass);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce() + " I am a student.";
        if (klass != null) {
            introduction += " I am in class " + klass.getNumber() + ".";
        }
        return introduction;
    }
}
