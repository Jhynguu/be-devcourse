package com.example.restemp.dao;

import com.example.restemp.dto.EmpTO;
import com.example.restemp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;

@Repository
public class EmpDAO {

    @Autowired
    private EmpMapper empMapper;

    public ArrayList<EmpTO> empAll() {
        return empMapper.empAll();
    }

    public EmpTO empByEmpno(String empno) {
        return empMapper.empByEmpno(empno);
    }

    public int insert(EmpTO to) {
        return empMapper.insert(to);
    }

    public int update(EmpTO to) {
        return empMapper.update(to);
    }

    public int delete(EmpTO to) {
        return empMapper.delete(to);
    }
}
