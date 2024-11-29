package com.example.restemp.controller;

import com.example.restemp.dao.EmpDAO;
import com.example.restemp.dto.EmpTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// html 문서 형식을 출력 제공
@Controller
@RequestMapping("/html")
public class HtmlController {

    @Autowired
    private EmpDAO empDAO;

    @RequestMapping( "/emp/list" )
    public String list(Model model) {
        model.addAttribute( "lists", empDAO.empAll() );

        return "list";
    }

    @RequestMapping( "/emp/ajax04" )
    public String ajax04() {
        return "ajax04";
    }
}

