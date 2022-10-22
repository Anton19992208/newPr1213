package com.example.practice;

import com.example.example2.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = List.of
                (
                        new Person(1, "Ivan1", "Ivanov"),
                        new Person(2, "Petr", "Petrov"),
                        new Person(3, "ffff", "qqqq"),
                        new Person(4, "ssss", "wwww"),
                        new Person(5, "dddd", "eeee")
                );
        personList.stream()
                .filter(p -> p.getName().length() > 4)
                .max(Comparator.comparing(Person::getId))
                .map(Person::getName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> stream = personList.stream()
                .collect(groupingBy(Person::getId, mapping(Person::getName, toList())));
        System.out.println(stream);


    }
}
