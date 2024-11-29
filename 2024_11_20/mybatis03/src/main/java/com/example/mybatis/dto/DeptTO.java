package com.example.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias(value = "to")
@Setter
@ToString
public class DeptTO {
    private String deptno;
    private String dname;
    private String loc;
}
