package org.example.controller1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/controller"})

public class ControllerEx01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) {

        try {
            String path = req.getParameter("path");

            Action action = null;
            String url = "";
            if (path == null || path.equals("view1")) {

                // back-end controller 호출
                // View1Action action = new View1Action();

                // Action action = new View1Action();
                action = new View1Action();
                action.execute(req, resp);

                System.out.println("view1 호출");
                url = "/WEB-INF/views/view1.jsp";
            } else if (path.equals("view2")){


                // View2Action action = new View2Action();

                // Action action = new View1Action();
                action = new View2Action();
                action.execute(req, resp);

                System.out.println("view2 호출");
                url = "/WEB-INF/views/view2.jsp";
            } else {
                System.out.println("[에러] 요청 url 오류");
                url = "/WEB-INF/views/error.jsp";
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher(url);
            dispatcher.forward(req, resp); // try - catch 는 forward 때문에 걸었음
        } catch (ServletException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }
}
