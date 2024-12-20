package com.util1;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
    public static void main(String[] args) {

        String strData = "사과&참외&&수박&&&딸기";

        // 데이터가 없으면 제거
        StringTokenizer st = new StringTokenizer(strData, "&");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // 있는 그대로 제거
        String[] datas = strData.split("&");
        System.out.println(datas.length);
        for (String data : datas) {
            System.out.println(data);
        }
    }
}
