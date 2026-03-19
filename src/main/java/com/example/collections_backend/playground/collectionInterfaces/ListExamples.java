package com.example.collections_backend.playground.collectionInterfaces;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Obj0");
        list.add("Obj1");
        list.add("Obj2");
        System.out.println(list);
        //list.remove(2);
        System.out.println(list);
        String str = list.get(0);
        System.out.println(str);
        for (String item : list) {
            System.out.println(item);
        }
    }
}
