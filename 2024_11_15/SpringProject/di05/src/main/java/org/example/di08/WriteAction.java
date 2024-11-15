package org.example.di08;

import org.springframework.beans.factory.annotation.Autowired;

public class WriteAction {

    // 내부적으로 인스턴스화 되어있는 걸 찾아가서 인스턴스를 물려줌 - 자동 주입 -> 필드 의존성 자동 주입 (많이 쓰이지는 않음)
    //@Autowired
    private BoardDAO dao;

    // 생성자
    @Autowired
    public WriteAction(BoardDAO dao) {
        System.out.println("WriteAction(BoardDAO dao) 호출");
        this.dao = dao;
    }

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
    }

    public void getDao() {
        System.out.println("dao : " + dao);
    }
}
