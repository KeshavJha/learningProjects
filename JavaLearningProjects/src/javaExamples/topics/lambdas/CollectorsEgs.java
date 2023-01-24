package javaExamples.topics.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEgs {
    public static void main(String[] args) {
//        int option =
        joiningStrings();
    }
    public static void collectingToList() {
        Stream.of(1,2,3,4).collect(Collectors.toList());
        Arrays.asList(1,2,3,4);
        Collections.emptyList();
//        Streams
    }

    public static void joiningStrings()  {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        // Following gives error -- becase "of" returns a stream of list . Next line creates a stream of strings from the list
//        Stream.of(strings).collect(Collectors.joining(",", "[", "]"));
        String combined = strings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(combined);

        System.out.println(Stream.of(strings).collect(Collectors.toList()).toString());
    }
}
