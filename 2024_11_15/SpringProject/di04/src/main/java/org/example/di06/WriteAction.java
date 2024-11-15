package org.example.di06;

import lombok.Setter;

@Setter
public class WriteAction {
    private BoardTO to;

    // 실행
    public void execute() {
        System.out.println(to);
    }
}
