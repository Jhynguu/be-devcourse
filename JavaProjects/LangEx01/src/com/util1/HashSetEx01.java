package com.util1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
    public static void main(String[] args) {

        // 순서가 없으니깐 인덱스도 없음
        HashSet<String> hs = new HashSet<String>();
//        Set<String> hs2 = new HashSet<>();
        hs.add("홍길동");
        hs.add("박문수");
        hs.add("임꺽정");
        System.out.println(hs);

        // 중복제거 가능
        hs.add("박문수");
        hs.add("임꺽정");
        hs.add("이몽룡");
        System.out.println(hs);

        System.out.println(hs.size());

        for (String data : hs) {
            System.out.println(data);
        }

        // Iterator
        Iterator<String> it = hs.iterator();
        // StringTokenizer
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
