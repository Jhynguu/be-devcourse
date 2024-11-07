package com.io1;

import java.io.File;
import java.util.Date;

public class FileEx03 {
    public static void main(String[] args) {

        File file = new File("c:/java/data.pdf");
        long fileSize = file.length();
        // byte 단위 -> Kbyte
        // 1000 -> 2 -> 1024
        System.out.println("File Size: " + fileSize / 1024);

        // 수정 날짜
        long fileDate = file.lastModified();
        System.out.println(fileDate);
        System.out.println(new Date(fileDate).toLocaleString());
    }
}
