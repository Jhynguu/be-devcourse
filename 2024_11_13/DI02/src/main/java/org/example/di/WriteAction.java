package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Bean과 같음
@Service("writeAction")
public class WriteAction {

    // 필드 주입
    //@Autowired
    private BoardDAO dao;

    // Setter 주입
    // 생성자 주입
    @Autowired
    public WriteAction(BoardDAO dao) {
        System.out.println("WriteAction(BoardDAO dao) 생성자 호출");
        this.dao = dao;
    }

    //public WriteAction() {
    //    System.out.println("Write Action() 생성자 호출");
    //    System.out.println("1 : " + dao);
    //}

    public void getDAO() {
        System.out.println("2 : " + dao);
    }
}
