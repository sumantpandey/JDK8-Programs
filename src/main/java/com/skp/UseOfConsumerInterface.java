package com.skp;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/**
 * A Consumer FI accepts a single argument and returns no result. Its abstract method is accept(Object). As usual,
 * Java 8 also provides convenient interfaces for the primitive data types:
 * IntConsumer, LongConsumer, DoubleConsumer, BiConsumer, ObjtIntConsumer, ObjLongConsumer, and ObjDoubleconsumer
 */
public class UseOfConsumerInterface {

    public static void main(String[] args) {
        BiConsumerTest_print();
        ConsumerTest_convertToLowercase();
        DoubleConsumerTest_printout();
        IntConsumerTest_printout();
    }

    public static void BiConsumerTest_print() {
        BiConsumer<String, String> bf = (a, b) -> System.out.println(a + "," + b);
        bf.accept("biconsumer", "printInput");
    }

    public static void ConsumerTest_convertToLowercase() {
        Consumer<String> consumer = (a) -> System.out.println(a.toLowerCase());
        consumer.accept("convertToLowercase");
    }

    public static void DoubleConsumerTest_printout() {
        DoubleConsumer dc = System.out::println;
        dc.accept(3.56);

    }

    public static void IntConsumerTest_printout() {
        IntConsumer ic = System.out::println;
        ic.accept(67);
    }

}
