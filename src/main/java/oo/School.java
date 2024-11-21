package oo;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Klass> classes = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addClass(Klass klass) {
        classes.add(klass);
    }

    public void startSchool() {
        for (Teacher teacher : teachers) {
            teacher.introduce();
        }

        for (Klass klass : classes) {
            for (Student student : klass.getStudents()) {
                student.introduce();
            }
        }
    }
}