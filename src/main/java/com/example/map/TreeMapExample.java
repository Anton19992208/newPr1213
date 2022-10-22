package com.example.map;

import com.example.example2.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(100, "Petr1", "Petrov1");
        Person petr25 = new Person(25, "Petr2", "Petrov2");
        Person petr2 = new Person(2, "Petr3", "Petrov3");
        Person petr3 = new Person(3, "Petr4", "Petrov4");

        Map<Integer, Person> map = new TreeMap<>();
        map.putIfAbsent(ivan.getId(), ivan);
        map.putIfAbsent(petr.getId(), petr);
        map.putIfAbsent(petr25.getId(), petr25);
        map.putIfAbsent(petr3.getId(), petr2);
        map.putIfAbsent(petr2.getId(), petr3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
