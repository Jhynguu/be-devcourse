package com.lang1;

public class InitCapEx01 {
    public static void main(String[] args) {
        // 입력값 검사
        // 입력 : 1
        if (args.length != 1) {
            System.out.println("1개 입력하셔야 합니다.");
        } else {
            System.out.println("정상입력");

            String name = args[0];
//            System.out.println(name);

            String[] names = name.split(" ");
//            System.out.println(names[0]);

            // charAt - 문자열 -> 문자(x) 지양...
//            System.out.println(names[0].substring(0, 1).toUpperCase());
//            System.out.println(names[0].substring(1));

            String result = "";
            for(int i = 0; i < names.length; i++) {
                result += names[i].substring(0, 1).toUpperCase() + names[i].substring(1) + " ";
            }
            System.out.println(result);
        }
    }
}
