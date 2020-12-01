package com.sjhello.chapter8;

public class ManagerStudent {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();

        Student [] student = null;
        student = managerStudent.addStudent();
        managerStudent.printStudents(student);
    }

    public void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public Student[] addStudent() {
        Student [] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010xxxxxxxx", "sjhello235@gmail.com");

        return students;
    }
}
