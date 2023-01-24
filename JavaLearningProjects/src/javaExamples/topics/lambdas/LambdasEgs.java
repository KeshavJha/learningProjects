package javaExamples.topics.lambdas;

import java.text.DateFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasEgs {
    public static void main(String[] args) {
        System.out.println(moreThan10.test(5));
        System.out.println(moreThan10.test(11));

        System.out.println(length5OrMore.test("hello"));
        System.out.println(length5OrMore.test("zero"));

        System.out.println(lengthOfString.apply("hello world"));

        printIt.accept("hello ji");
        printInt.accept(lengthOfString.apply("Testing this sting"));

        printDouble.accept(randomFloat.get());

        helloWorld.run();

        assert(1==1);

    }
    static Predicate<Integer> moreThan10 = value -> value > 10;
    static Predicate<String> length5OrMore = str -> str.length() >= 5;

    static Function<String, Integer> lengthOfString = str -> str.length();

    static Consumer<String> printIt = str -> System.out.println(str);
    static Consumer<Integer> printInt = str -> System.out.println(str);
    static Consumer<Double> printDouble = str -> System.out.println(str);

    static Supplier<Double> randomFloat = () -> Math.random();

    static Runnable helloWorld = () -> System.out.println("Hello from new Thread");
}
