package org.example.controller1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class View1Action implements Action {
    //
    // public void execute(HttpServletRequest req, HttpServletResponse resp) {
    //    System.out.println("View1Action 호출");

    //}

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("View1Action 호출");
    }
}