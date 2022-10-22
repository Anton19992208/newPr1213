package com.example.lambda;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        Optional <Student> maybeStudent = Stream.of(new Student("Nik", 19),
                new Student("Tok", 23),
                new Student("Nil", 27),
                new Student("Lol", 34),
                new Student("Dol", 44),
                new Student("Lok", 66)
        )
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
        maybeStudent.ifPresent(System.out::println);

    }
}
