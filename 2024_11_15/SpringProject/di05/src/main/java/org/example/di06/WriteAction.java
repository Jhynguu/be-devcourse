package org.example.di06;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WriteAction implements Action {
    private BoardTO to;

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
    }

    // 실행
    @Override
    public void execute() {
        System.out.println(to);
    }
}
