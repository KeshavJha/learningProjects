package javaExamples.topics.collections;

import java.util.*;

public class ListsEgs {
    List<String> strList = new ArrayList<>();

    public static void main(String[] args) {
        listOfExample();
    }

    private static void listExample() {
        Collection<String> strList1 = new ArrayList<>();
        strList1.add("keshav");
        String s1 = "keshav";
        System.out.println( strList1.contains(new String("keshav")) );
        System.out.println( strList1.contains(s1) );
    }

    private static void listOfExample() {
        Collection<String> strList1 = List.of("listOfExample");
//        strList1.addAll(List.of("user1"));
        String s1 = "keshav";
        System.out.println( strList1.contains(new String("keshav")) );
        System.out.println( strList1.contains(s1) );
    }

    public static void SetExample() {
        Map<Integer, String> intToStrMap = new TreeMap<>();
        Set<String> intToStrSet = new TreeSet<>();
    }

}
