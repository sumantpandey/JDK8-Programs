package com.skp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The Collections class and Comparator interface
 * are enhanced in Java 8. Comparator is annotated with @FunctionalInterface.
 * Collections‘ sort method takes Comparator as an argument.
 * Below class is to demonstrate how to:
 * Sort a list of contacts by their age
 * Sort a list of String
 * Compare the sorting to JDK7 style
 */
public class UseOfCollectionsAndComparatorInterface {

    public static void main(String[] args) {
        Collections_sort_by_employee_age();
        Collections_sortWithInferType();
    }

    public static void Collections_sort_by_employee_age() {
        Comparator comparator = Comparator.comparing(Employee::getAge);
        List<Employee> list = Employee.getEmployees();
        Collections.sort(list, comparator);
        System.out.println(list);
    }

    public static void Collections_sortWithInferType() {
        List<Employee> list = Employee.getEmployees();
        Collections.sort(list, (a, b) -> {
            return a.getFirstName().compareTo(b.getFirstName());
        });
        System.out.println(list);
    }

    static class Employee {
        private String firstName;
        private String lastName;
        private int age;

        public Employee() {
            super();
        }

        public Employee(String firstName, String lastName, int age) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public static List<Employee> getEmployees() {
            Employee e1 = new Employee("emp1FirstName", "emp1LasstName", 26);
            Employee e2 = new Employee("emp2FirstName", "emp2LasstName", 25);
            Employee e3 = new Employee("emp3FirstName", "emp3LasstName", 27);
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(e1);
            employeeList.add(e2);
            employeeList.add(e3);
            return employeeList;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
