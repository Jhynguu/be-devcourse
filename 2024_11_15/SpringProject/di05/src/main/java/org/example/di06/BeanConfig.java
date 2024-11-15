package org.example.di06;

import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public BoardTO boardTO() {
        BoardTO to = new BoardTO();
        to.setSeq(1);
        to.setSubject("제목");
        return to;
    }

    @Bean
    public WriteAction writeAction1() {
        WriteAction writeAction = new WriteAction();
        writeAction.setTo(boardTO());
        return writeAction;
    }

    @Bean
    public WriteAction writeAction2() {
        BoardTO to = new BoardTO();
        to.setSeq(2);
        to.setSubject("제목 2");

        WriteAction writeAction = new WriteAction();
        writeAction.setTo(to);
        return writeAction;
    }

    @Bean
    public Action writeAction3() {
        BoardTO to = new BoardTO();
        to.setSeq(3);
        to.setSubject("제목 3");

        WriteAction writeAction = new WriteAction();
        writeAction.setTo(to);
        return writeAction;
    }
}
