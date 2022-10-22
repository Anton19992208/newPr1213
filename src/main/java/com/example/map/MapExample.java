package com.example.map;

import com.example.example2.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Map<Integer, Person> map = new HashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

//        for (Person person : map.values()) {
//            System.out.println(person.getName());
//
//        }
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            Person value = entry.getValue();
            Integer value2 = entry.getKey();

            System.out.println(value2 + " " + value );

            System.out.println(map.containsKey(1));

            System.out.println(map.size());

            System.out.println(map.isEmpty());

            System.out.println(map.getOrDefault(4, ivan));

        }
    }
}

