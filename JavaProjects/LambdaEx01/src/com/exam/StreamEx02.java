package com.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {
    public static void main(String[] args) {
        // Stream 생성
        // List / Set / Map -> 스트림 변경 가능
        // 문자열
        // 배열
        // 문자 배열 => 문자열
        // 특정 범위 정수
        // 난수
        // 람다식
        // 빈 스트림

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        // for 문을 통한 출력
        intStream.forEach(System.out::println);

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 빈 스트림
        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("출력");
        emptyStream.forEach(System.out::println);
    }
}
