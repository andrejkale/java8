package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Stream.of("a1","a2","a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(out::println);
        IntStream.range(1,4)
                .mapToObj(i-> "a" +  i)
                .forEach(out::println);

        Stream<Date> stream = Stream.generate(()->{return  new Date();});
        stream.limit( 10).forEach(System.out::println);

        IntStream stream1 = "12345_abcdef".chars();
        stream1.forEach( p -> System.out.println(p));

        Random random = new Random();
        random.ints(1, 10).limit(10).forEach(System.out::println);
    }
}
