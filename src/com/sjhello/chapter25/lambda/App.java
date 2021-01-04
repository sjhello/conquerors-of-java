package com.sjhello.chapter25.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
//        Function<Integer, Integer> function = integer -> integer + 10;
//        Function<Integer, Integer> function2 = integer -> integer * 2;
//        Function<Integer, Integer> compose = function.compose(function2);
//        Function<Integer, Integer> andThen = function.andThen(function2);
//
//        System.out.println(compose.apply(30));    // 70
//        System.out.println(andThen.apply(30));    // 80

        App app = new App();

        String apple = "apple";
        String banana = "banana";

        Predicate<String> containsApple = s -> s.contains("apple");
        Predicate<String> containsBanana = s -> s.contains("banana");

        app.predicateTest(containsApple, "apple");
        app.predicateAnd(containsApple, containsBanana, "apple");
        app.predicateOr(containsApple, containsBanana, "apple");
        app.predicateNeGate(containsApple, "apple");
        app.predicateIsEqual("cvcv");
    }

    private void predicateTest(Predicate<String> p, String data) {
        System.out.println(p.test(data));
    }

    private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.and(p2).test(data));
    }

    private void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.or(p2).test(data));
    }

    private void predicateNeGate(Predicate<String> p, String data) {
        System.out.println(p.negate().test(data));
    }

    private void predicateIsEqual(String data) {
        Predicate<String> p1 = Predicate.isEqual(data);
        System.out.println(p1.test("cvcv"));
    }
}
