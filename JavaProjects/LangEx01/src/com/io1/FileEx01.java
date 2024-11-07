package com.io1;

import java.io.File;

public class FileEx01 {
    public static void main(String[] args) {
        // Directory(특수목적파일) / File

        // 경로
        // 절대 경로 : 드라이브명 부터 추적 C:\Java\JavaProject\JavaEx01
        // 상대 경로 : 현재 실행위치 부터 추적 . (현재) / ..(부모)

        // 경로를 통해서 File 객체 생성
        // 디렉토리에 대한 File 객체 생성
        // File dir = new File("c:\\java");
        File dir = new File("c:/java");
        System.out.println(dir);

        // 파일에 대한 File 객체 생성
        File file = new File("c:/java/test.txt");
        System.out.println(file);
        File file2 = new File("c:/java", "test.txt");
        System.out.println(file2);

        // 존재 유무
        System.out.println(dir.exists());
        System.out.println(file.exists());
    }
}