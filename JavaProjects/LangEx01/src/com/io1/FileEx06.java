package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx06 {
    public static void main(String[] args) {
        File file = new File( "c:/java/newtest1.txt" );
        try {
            if( !file.exists() ) {
                file.createNewFile();
            } else {
                file.renameTo( new File( "c:/java/newtest2.txt" ) );
            }
        } catch (IOException e) {
            System.out.println( e.getMessage() );
        }
    }
}