package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx05 {
    public static void main(String[] args) {
        // 디렉토리 생성 / 이름변경 / 삭제
        // mkdir
        // renameTO
        // delete

        //File dir = new File( "c:/java/dir3" );
        //dir.mkdir();
        //dir.renameTo( new File( "c:/java/dir4" ) );

        //File dir2 = new File( "c:/java/dir4" );
        //dir2.delete();

        // 파일 생성 / 이름변경 / 삭제
        // createNewFile
        try {
            File file = new File( "c:/java/test2.txt" );
            file.createNewFile();
        } catch (IOException e) {
            System.out.println( e.getMessage() );
        }
    }
}