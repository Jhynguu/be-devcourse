package com.example.restemp.controller;

import com.example.restemp.dao.EmpDAO;
import com.example.restemp.dto.EmpTO;
import com.example.restemp.mapper.EmpMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class EmpRestController {

    @Autowired
    private EmpDAO empDAO;

    @GetMapping( "/emp/response" )
    public ArrayList<EmpTO> empAllJSON() {
        return empDAO.empAll();
    }

    @PostMapping( "/emp/response" )
    public String post(HttpServletRequest request) {
        EmpTO to = new EmpTO();
        to.setEmpno( request.getParameter("empno") );
        to.setEname( request.getParameter("ename") );
        to.setJob( request.getParameter("job") );
        to.setMgr( request.getParameter("mgr") );
        to.setHiredate( request.getParameter("hiredate") );
        to.setSal( request.getParameter("sal") );
        to.setComm( request.getParameter("comm") );
        to.setDeptno( request.getParameter("deptno") );

        int flag = empDAO.insert( to );

        return "{ \"flag\" : \"" + flag + "\" }";
    }

    @PutMapping( "/emp/response/{empno}" )
    public String putById(@PathVariable String empno, HttpServletRequest request) {
        EmpTO to = new EmpTO();
        to.setEmpno( empno );
        to.setEname( request.getParameter("ename") );
        to.setJob( request.getParameter("job") );
        to.setMgr( request.getParameter("mgr") );
        to.setHiredate( request.getParameter("hiredate") );
        to.setSal( request.getParameter("sal") );
        to.setComm( request.getParameter("comm") );
        to.setDeptno( request.getParameter("deptno") );

        int flag = empDAO.update( to );

        return "{ \"flag\" : \"" + flag + "\" }";
    }

    @DeleteMapping( "/emp/response/{empno}" )
    public String deleteById(@PathVariable String empno) {
        EmpTO to = new EmpTO();
        to.setEmpno( empno );

        int flag = empDAO.delete( to );
        return "{ \"flag\" : \"" + flag + "\" }";
    }

}
