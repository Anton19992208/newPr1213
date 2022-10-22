package com.example.practice;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, Integer> counts = Map.of
                (
                        "string1", 1,
                        "string2", 1,
                        "string3", 1,
                        "string", 1,
                        "string5", 1
                );
        int result = counts.entrySet().stream()
                .filter(entry -> entry.getKey().length() > 6)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(result);
    }
}
