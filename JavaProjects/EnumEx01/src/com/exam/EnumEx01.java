package com.exam;

public class EnumEx01 {
    public static void main(String[] args) {
        Week monday = Week.Monday;
        // 열거형의 이름
        System.out.println(monday);
        System.out.println(Week.Monday);

        // 메서드
        String name = monday.name();
        System.out.println(name);

        Week friday = Week.Friday;
        int weekNum = monday.ordinal();
        System.out.println(weekNum);
        weekNum = friday.ordinal();
        System.out.println(weekNum);

        // compareTo
        Week day1 = Week.Monday;
        Week day2 = Week.Friday;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        // valueOf
        Week day = Week.valueOf("Sunday");
        System.out.println(day);

        // values()
        Week[] days = Week.values();
        for (Week week : days) {
            System.out.println(week);
        }
    }
}
