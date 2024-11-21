package oo;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }
    public void join(Klass klass) {
        this.klass = klass;
    }
    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.equals(klass);
    }
    public Klass getKlass() {
        return klass;
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

