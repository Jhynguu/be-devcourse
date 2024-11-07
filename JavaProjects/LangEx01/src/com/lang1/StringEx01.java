package com.lang1;

public class StringEx01 {
    public static void main(String[] args) {
        // 생성
        String str1 = "Hello World";

        String str2 = new String("Hello World");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
