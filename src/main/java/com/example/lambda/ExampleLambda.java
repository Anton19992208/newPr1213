package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleLambda {

    public static void main(String[] args) {
        PersonsBalance petr = new PersonsBalance("petr", 22, "voronov", 200);
        PersonsBalance petr1 = new PersonsBalance("petr", 34, "bov", 300);
        PersonsBalance petr2 = new PersonsBalance("petr", 55, "ich", 400);
        PersonsBalance petr3 = new PersonsBalance("petr", 66, "ko", 500);
        PersonsBalance petr4 = new PersonsBalance("petr", 277, "do", 6700);

        List<PersonsBalance> people = new ArrayList<>();
        people.add(petr);
        people.add(petr1);
        people.add(petr2);
        people.add(petr3);
        people.add(petr4);


//        Comparator <Integer> comparator = Integer::compare;
//        System.out.println(comparator.compare(12, 20));

        List<String> strings = List.of("11", "12", "13", "14", "15");
        strings.stream()
                .map(s -> s + s)
                .map(Integer::valueOf)
                .filter(v -> v % 2 == 0)
                .sorted()
                .skip(2)
                .limit(3)
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);

        IntStream.iterate(0, operand -> +2)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);


        for (String s : strings) {
            String value = s + s;
            Integer integer = Integer.valueOf(value);
            if (integer % 2 == 0) {
                System.out.println(integer);
            }

        }


    }

}
