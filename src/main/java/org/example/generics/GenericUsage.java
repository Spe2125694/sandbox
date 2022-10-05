package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUsage {
    public static void main(String[] args) {
        Box<Integer> integers = new Box<>(1);
        Box<Double> doubles = new Box<>(2.0);

        List<Box<?>> numbers = new ArrayList<>();
        numbers.add(integers);
        numbers.add(doubles);

        Crate<Box<?>> crate = new Crate<>(integers);
        System.out.println(crate.getValue());

        Crate<Box<Double>> crate2 = new Crate<>(doubles);
        System.out.println(crate2.getValue());
    }
}
