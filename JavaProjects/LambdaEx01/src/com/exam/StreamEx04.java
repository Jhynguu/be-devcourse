package com.exam;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx04 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("b", "cc", "D", "C", "AA", "F");

        // 오름차순
//        strStream.sorted().forEach(System.out::println);
        // comparedTo <- Comparable인터페이스 안에 있음
        // 비교 방법을 정할 수 있음
        // strStream.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);

        // 내림차순
        // strStream.sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
        // 위에 것 싫다면
        // strStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 대소문자 구별없이
        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
    }
}
