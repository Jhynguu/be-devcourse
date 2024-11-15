package org.example.di04;

public class WriteAction {
    private BoardTO to;

    public WriteAction() {
        System.out.println("Write Action() 호출");
    }

    public WriteAction(BoardTO to) {
        System.out.println("Write Action(BoardTO to) 호출");
        this.to = to;
    }
}
