package com.example.mybatis.service;

import com.example.mybatis.dto.DeptTO;
import com.example.mybatis.mapper.DeptMybatisMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptMybatisService {

    private DeptMybatisMapper deptMybatisMapper;

    public DeptMybatisService(DeptMybatisMapper deptMybatisMapper) {
        System.out.println("DeptMybatisService(DeptMybatisMapper deptMybatisMapper) 생성자 호출");
        this.deptMybatisMapper = deptMybatisMapper;
    }

    public void select() {
        System.out.println(deptMybatisMapper.select());
    }

    public void findAll() {
        List<DeptTO> lists = deptMybatisMapper.findAll();
        for (DeptTO to : lists) {
            System.out.println(to);
        }
    }

    public void insert() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");
        to.setDname("연구부");
        to.setLoc("부산");

        int result = deptMybatisMapper.insert(to);
        System.out.println("결과 : " + result);
    }

    public void update() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");
        to.setDname("생산부");
        to.setLoc("강릉");

        int result = deptMybatisMapper.update(to);
        System.out.println("결과 : " + result);
    }

    public void delete() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");

        int result = deptMybatisMapper.delete(to);
        System.out.println("결과 : " + result);
    }
}
