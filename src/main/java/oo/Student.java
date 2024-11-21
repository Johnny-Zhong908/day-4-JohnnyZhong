package oo;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.addStudent(this);
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
            if (klass.isLeader(this)) {
                introduction += " I am the leader of class " + klass.getNumber() + ".";
            } else {
                introduction += " I am in class " + klass.getNumber() + ".";
            }
        }
        return introduction;
    }

    public void notifyLeaderAssigned(Student leader, Klass klass) {
        System.out.println("I am " + this.getName() + ", student of Class " + klass.getNumber() +
                ". I know " + leader.getName() + " become Leader.");
    }
}
