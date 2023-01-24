package javaExamples.topics.collections;

import javaExamples.topics.ExampleUtils;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEgs {
    public static void main(String[] args) {
        navigatingTreeSet();
    }
    public static void navigatingTreeSet() {
        ExampleUtils.usageHeader("Verifying ordering of elements in a TreeSet");
        NavigableSet<String> treeSetStrings = new TreeSet<>();
        treeSetStrings.add("hello");
        treeSetStrings.add("world");
        treeSetStrings.add("i");
        treeSetStrings.add("am");
        treeSetStrings.add("here");

        System.out.println(treeSetStrings.toString());
    }
}
