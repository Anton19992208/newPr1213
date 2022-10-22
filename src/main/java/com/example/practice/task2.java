package com.example.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {

        List<String> strings = List.of(
                "string-1",
                "string-111",
                "string-1",
                "string-12",
                "string-1",
                "string-13",
                "string-2"
        );

        int size = (int) strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(size);
    }
}
