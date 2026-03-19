package com.example.collections_backend.playground.collectionInterfaces;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("1");
        set.add("2");
        set.add("Hello");
        set.add("World");
        set.add("45");

        for (String str : set) {
            System.out.println(str);
        }

        set.stream().forEach(System.out::println);
        set.stream().forEach(s -> System.out.println(s));

    }


}
