package oo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Set<Klass> classes;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new HashSet<>();
    }
    public void assignTo(Klass klass) {
        this.classes.add(klass);
        klass.attach(this);
    }
    public boolean belongsTo(Klass klass) {
        return this.classes.contains(klass);
    }
    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }
    @Override
    public String introduce() {
        String baseIntroduction = super.introduce() + " I am a teacher.";
        if (classes.isEmpty()) {
            return baseIntroduction + " I teach no class.";
        }
        String classNumbers = classes.stream()
                .sorted((k1, k2) -> Integer.compare(k1.getNumber(), k2.getNumber()))
                .map(klass -> String.valueOf(klass.getNumber()))
                .collect(Collectors.joining(", "));
        return baseIntroduction + " I teach Class " + classNumbers + ".";
    }
    public void notifyLeaderAssigned(Student leader, Klass klass) {
        if (this.belongsTo(klass)) {
            System.out.println("I am " + this.getName() + ", teacher of Class " + klass.getNumber() +
                    ". I know " + leader.getName() + " become Leader.");
        }
    }
}
