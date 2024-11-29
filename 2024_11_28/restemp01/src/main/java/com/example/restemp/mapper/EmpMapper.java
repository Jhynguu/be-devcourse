package com.example.restemp.mapper;

import com.example.restemp.dto.EmpTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface EmpMapper {

    ArrayList<EmpTO> empAll();
    EmpTO empByEmpno(String empno);

    int insert(EmpTO to);
    int update(EmpTO to);
    int delete(EmpTO to);
}
