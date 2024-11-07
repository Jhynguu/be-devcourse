package com.exception;

public class ExceptionEx10 {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb
                    = new ProcessBuilder("C:\\Windows\\system32\\notepad.exe");
            pb.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
