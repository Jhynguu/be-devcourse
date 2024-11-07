package com.util1;

import java.util.Calendar;

public class CalendatEx01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));

        // 요일 (일요일 : 1)
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        // => 한글로 요일을 찍고싶다?

        // switch
        // 숫자 = 순서 => 배열
        String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println(weekNames[calendar.get(Calendar.DAY_OF_WEEK) - 1]);

        System.out.println(calendar.getTimeInMillis());

        // 그 달의 마지막 날 / 그 달의 첫 날
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println(calendar.getActualMinimum(Calendar.DATE));
    }
}
