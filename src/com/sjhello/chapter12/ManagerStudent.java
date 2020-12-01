package com.sjhello.chapter12;

public class ManagerStudent {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();

        managerStudent.checkEquals();
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010xxxxxxxx", "sjhello235@gmail.com");
        Student b = new Student("Min", "Seoul", "010xxxxxxxx", "sjhello235@gmail.com");

        boolean hasEquals = a.equals(b);
        if (hasEquals) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
