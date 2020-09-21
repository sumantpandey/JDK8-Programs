package com.skp;

import java.util.List;
import java.util.stream.Collectors;

import static com.skp.UseOfCollectionsAndComparatorInterface.Employee;

/**
 * Java 8 Stream API iterates and processes elements in a collection in a declarative style.
 * Developers no longer use a loop to find, search, and filter elements in a collection of objects.
 */
public class StreamApiExamples {

    public static void main(String[] args) {
        List<Employee> list = UseOfCollectionsAndComparatorInterface.Employee.getEmployees();
        search(list);
        transform(list);
        foreach(list);
    }

    public static void search(List<Employee> inputList) {
        List list = inputList.stream().filter(name -> name.getFirstName().contains("1")).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void transform(List<Employee> inputList) {
        List list = inputList.stream().map(emp -> emp.getAge() + 5).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void foreach(List<Employee> listInput) {
        listInput.stream().forEach(System.out::println);
    }
}
