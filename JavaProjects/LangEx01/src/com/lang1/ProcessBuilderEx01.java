package com.lang1;

public class ProcessBuilderEx01 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb
//                = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
                = new ProcessBuilder("C:\\Windows\\system32\\notepad.exe");
        pb.start();
    }
}
