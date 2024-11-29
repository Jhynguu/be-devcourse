package com.example.model.controller;

import com.example.model.dto.FormTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfigController {

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/form_ok")
    public String form_ok(
            HttpServletRequest request
    ) {

        // view 전송
        String userid = request.getParameter("userid");
        String userpw = request.getParameter("userpw");

        request.setAttribute("userid", userid);
        request.setAttribute("userpw", userpw);

        return "form_ok";
    }

    @RequestMapping("/form_ok2")
    public String form_ok2(
            HttpServletRequest request,
            Model model
    ) {
        String userid = request.getParameter("userid");
        String userpw = request.getParameter("userpw");

        // view 전송
        model.addAttribute("userid", userid);
        model.addAttribute("userpw", userpw);

        return "form_ok";
    }

    @RequestMapping("/form_ok3")
    public ModelAndView form_ok3(
            HttpServletRequest request,
            Model model
    ) {
        String userid = request.getParameter("userid");
        String userpw = request.getParameter("userpw");

        // view 전송
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("form_ok3");
        modelAndView.addObject("userid", userid);
        modelAndView.addObject("userpw", userpw);

        return modelAndView;
    }

    @RequestMapping("/form_ok4")
    public String form_ok4(
            FormTO to,
            Model model
    ) {
        //String userid = to.getUserid();
        //String userpw = to.getUserpw();

        //model.addAttribute("userid", userid);
        //model.addAttribute("userpw", userpw);

        model.addAttribute("to", to);
        return "form_ok2";
    }

    @RequestMapping("/form_ok5")
    public String form_ok5(
            @ModelAttribute(value = "to") FormTO to
    ) {
        // 데이터 수정
        to.setUserid("new id");
        to.setUserpw("123456");

        return "form_ok2";
    }

    // redirect
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/redirect1")
    public String redirect1(Model model) {

        model.addAttribute("userid", "tester");
        //return "redirect1";
        return "redirect:main";
    }

    @RequestMapping("/forward1")
    public String forward1(Model model) {
        model.addAttribute("userid", "tester");
        return "forward:main";
    }
}
