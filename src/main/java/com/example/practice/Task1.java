package com.example.practice;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List <Integer> ints = List.of(115, 12, 10, 25, 60, 103, 301, 226);
        OptionalDouble optionalDouble = ints.stream()
                .filter(i -> i % 5 == 0 & i % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
