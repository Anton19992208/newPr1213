package com.example.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 2, 6, 3);
        String result = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "start: ", " end."));
        System.out.println(result);

    }
}
