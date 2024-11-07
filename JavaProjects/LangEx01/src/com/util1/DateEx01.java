package com.util1;

import java.util.Date;

public class DateEx01 {
    public static void main(String[] args) {
        // Date 객체 생성
        java.util.Date date1 = new java.util.Date();
        // toString() 오버라이딩
        System.out.println(date1);
        System.out.println(date1.toString());

        // 현재 날짜 시간을 표시
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(date2.toLocaleString());

        String strDate = date2.toLocaleString();
        System.out.println(strDate);

        // 년 월 일 분리해서 출력
        System.out.println(strDate.substring(0, 4));
        System.out.println(strDate.substring(6, 8));
        System.out.println(strDate.substring(10, 12));

        // 분리하는 메서드가 있음
        System.out.println(date1.getYear() + 1900);
        System.out.println(date1.getMonth() + 1);
        // 일
        System.out.println(date1.getDate());
        // 요일 (0 : 일요일)
        System.out.println(date1.getDay());
        // 밀리세컨드 단위 환산된 시간
        System.out.println(date1.getTime());
        System.out.println(System.currentTimeMillis());

        // 특정 날짜 세팅
//        Date date3 = new Date(2024 - 1900, 10 - 1, 1);
        // date에 0을 넣으면 전 달 마지막 날이 출력됨
        Date date3 = new Date(2024 - 1900, 10 - 1, 0);
        System.out.println(date3);
    }
}
