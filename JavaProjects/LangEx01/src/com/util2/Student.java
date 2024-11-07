package com.util2;

public class Student {
    private String hakbun;
    private String name;
    // 국어 성적
    private String kor;
    private String eng;
    private String mat;

    // setter
    public Student(String hakbun, String name, String kor, String eng, String mat) {
        this.hakbun = hakbun;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }

    public String getMat() {
        return mat;
    }
}
