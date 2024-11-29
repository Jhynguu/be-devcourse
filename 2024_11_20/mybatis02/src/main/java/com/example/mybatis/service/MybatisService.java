package com.example.mybatis.service;

import com.example.mybatis.dao.MybatisRepository;
import com.example.mybatis.dto.DeptTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisService {

    private MybatisRepository mybatisRepository;

    // 생성자 주입(@Service -> 생성자 자동 호출)
    public MybatisService(MybatisRepository mybatisRepository) {
        System.out.println("MybatisService(MybatisRepository mybatisRepository) 생성자 호출");
        this.mybatisRepository = mybatisRepository;
    }

    public void select() {
        System.out.println(mybatisRepository.select());
    }

    public void selectlist() {
        List<DeptTO> lists = mybatisRepository.selectlist();
        for(DeptTO to : lists) {
            System.out.println(to);
        }
    }
}
