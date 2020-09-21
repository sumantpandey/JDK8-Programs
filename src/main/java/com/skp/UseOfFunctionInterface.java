package com.skp;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class UseOfFunctionInterface {
    public static void main(String[] args) {
        BiFunction_to_concat_two_string();
        BiFunction_multiply_two_int();
        DoubleToFunction_convertDoubleToString();
        DoubleToIntFunction_convertDoubleToInt();
        Function_combine_two_function();
    }

    public static void BiFunction_to_concat_two_string() {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("first", ",second"));

    }

    public static void BiFunction_multiply_two_int() {
        BiFunction<Integer, Integer, Integer> multiple = (a, b) -> a * b;
        System.out.println(multiple.apply(4, 5));
    }

    public static void DoubleToFunction_convertDoubleToString() {
        DoubleFunction df = (d) -> Double.toString(d);
        System.out.println(df.apply(123.98));
    }

    public static void DoubleToIntFunction_convertDoubleToInt() {
        DoubleToIntFunction dti = (d) -> (int) d;
        System.out.println(dti.applyAsInt(234.54));
    }

    public static void Function_combine_two_function() {
        Function<User, String> f1 = User::getName;
        Function<String, String> f2 = (str) -> str.toLowerCase();
        Function<User, String> f3 = f1.andThen(f2);
        System.out.println(f3.apply(new User("Shyam", 35)));
    }

    public static class User {

        static String name = "Raam";
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }
}
