package com.util1;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main(String[] args) {

        String strData1 = "사과 참외 수박 딸기";
        StringTokenizer st = new StringTokenizer(strData1);

        System.out.println(st.countTokens());

        // newtToken() 할 때 마다 다음 데이터 출력
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
        // 에러
        // System.out.println(st.nextToken());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println();

        String strData2 = "사과&참외&수박&딸기";
        StringTokenizer st2 = new StringTokenizer(strData2, "&");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
