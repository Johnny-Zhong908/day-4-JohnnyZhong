package oo;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void attach(Teacher teacher) {
        teachers.add(teacher);
    }

    public void attach(Student student) {
        students.add(student);
    }
    public void assignLeader(Student student) {
        if (students.contains(student)) {
            this.leader = student;

            // 通知所有的老师
            for (Teacher teacher : teachers) {
                teacher.notifyLeaderAssigned(student, this);
            }

            // 通知所有的学生
            for (Student s : students) {
                if (!s.equals(student)) {
                    s.notifyLeaderAssigned(student, this);
                }
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public boolean isLeader(Student student) {
        return student.equals(leader);
    }
}
