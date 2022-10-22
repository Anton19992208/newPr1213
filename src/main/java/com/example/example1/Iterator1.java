package com.example.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = new ArrayList<>(list);

//        for (Integer integer : list2) {
//            System.out.println(integer);
        list2.iterator().forEachRemaining(System.out::println);

        }
    }



