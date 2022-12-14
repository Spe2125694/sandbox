package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations

        // map
        List<Integer> square = numbers
                .stream()
                .map(x -> x * x)    // monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        System.out.println();

        // filter
        List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println();

        // sorted
        List<String> result2 = names.stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        System.out.println();

        // terminal functions

        // collect
        Set<Integer> squared = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        System.out.println();

        // forEach
        numbers.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));
        numbers.forEach(System.out::println);

        System.out.println();

        // reduce (non-stream)
        int sum = 0;
        for (int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Even Sum: " + sum);

        System.out.println();

        // reduce (stream)
        int evenSum = numbers.stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("Even Sum: " + sum);

        System.out.println();

        // int stream
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println("Total Sum: " + totalSum);

        System.out.println();

        // random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);

        System.out.println();

        // IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement)
                .limit(10)
                .filter(evenOnly)
                .forEach(System.out::println);
    }
}
