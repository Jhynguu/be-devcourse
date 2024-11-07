package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
    public static void main(String[] args) {
        // 디렉토리
        File file = new File("c:/java/dir2");
        // 디렉토리 생성
//        file.mkdir();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        // canExecute() / canRead() / canWrite()
        // isHidden()
        File file2 = new File("c:/java/test.txt");
        System.out.println(file2.isHidden());

        // 현재 경로
        File file3 = new File(".");
        // 경로
        System.out.println(file3.getName());
        System.out.println(file3.getParent());
        System.out.println(file3.getPath());
        try {
            System.out.println(file3.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
