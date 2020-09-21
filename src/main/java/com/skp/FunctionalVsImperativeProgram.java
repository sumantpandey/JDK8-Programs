package com.skp;

import java.util.ArrayList;
import java.util.List;

public class FunctionalVsImperativeProgram {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            studentList.add(new Student("Student" + i, i + 20));
        }

        printStudentImperatively(studentList, 25);
        printStudentFunctionaly(studentList, 25);
    }

    private static void printStudentImperatively(List<Student> studentList, int age) {
        for (Student student : studentList) {
            if (student.age < 25) {
                System.out.println(student);
            } else {
                System.out.println("Student is older than 25 years");
            }
        }
    }

    private static void printStudentFunctionaly(List<Student> studentList, int age) {
        studentList.stream()
                .filter(student -> student.age < age)
                .forEach(student -> System.out.println(student));

    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + ": " + age;
        }
    }

}
