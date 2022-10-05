package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {

        // x -> x*2
        // A lambda is an anonymous function.

        // Predicate - take 1 (or more) value(s) & returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - take a value & return a value
        Function<Integer, Integer> function = x -> x * 2;

        // Supplier - take nothing & return a value.
        Supplier<String> supplier = () -> "Hello World";

        // Consumer - takes a value & returns nothing.
        Consumer<String> consumer = x -> System.out.println("x");

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
