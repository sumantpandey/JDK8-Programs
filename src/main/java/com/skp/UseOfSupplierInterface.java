package com.skp;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class UseOfSupplierInterface {

    public static void main(String[] args) {
        booleanSupplierExample();
        intSupplierExample();
        doubleSupplierExample();
        stringSupplierExample();
    }

    public static void booleanSupplierExample() {
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());
    }

    public static void intSupplierExample() {
        IntSupplier bs = () -> 5;
        System.out.println(bs.getAsInt());
    }

    public static void doubleSupplierExample() {
        DoubleSupplier bs = () -> 5;
        System.out.println(bs.getAsDouble());
    }

    public static void stringSupplierExample() {
        Supplier bs = () -> "stringSupplier";
        System.out.println(bs.get());
    }
}
