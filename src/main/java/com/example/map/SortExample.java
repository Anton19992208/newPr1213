package com.example.map;

import com.example.example2.Person;

import java.util.*;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("23", "123", "478484", "47487");

        Collections.sort(strings);

//        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(30, "Petr", "Petrov"),
                new Person(29, "Tom", "Cruz")
        );
        personList.stream()
                .filter(p -> p.getSurname().equals("Petrov"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        List <Integer> lol =  new ArrayList<>(Arrays.asList(22, 3, 12 ,14));
//       Optional <Integer> stream = lol.stream()
//               .filter(s -> s > 22)
//               .findFirst();
//       stream.ifPresent(System.out::println);
//       stream.orElseThrow(() -> new RuntimeException("Check your data"));

//
//        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
//
//
//        System.out.println(personList);
//        List<Integer> aim = new ArrayList<>(Arrays.asList(1, 5, 22, 4, 2, 100));
//        aim.stream()
//                .sorted()
//                .filter(a -> a > 5)
//                .map(String::valueOf)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
    }

    public static class firstNameComparator implements Comparator<Person> {


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());

        }
    }
}
