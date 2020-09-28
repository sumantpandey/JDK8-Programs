package com.skp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;
import static java.util.stream.Collectors.toList;

class StreamExampleJava8 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4); // Configure the number of threads
        forkJoinPool.submit(() -> IntStream.range(1, 1_000_000)
                .parallel()
                .filter(StreamExampleJava8::isPrime).boxed()
                .collect(toList()))
                .get()
                .forEach(System.out::println);
        forkJoinPool.shutdown();
    }

    private static boolean isPrime(long n) {
        return n > 1 && IntStream.rangeClosed(2, (int) sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }
}