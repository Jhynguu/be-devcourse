package com.example.zipcode.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ZipcodeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ArrayList<ZipcodeTO> searchZipcode(String strDong) {
        // List<Map
        // List<ZipcodeTO
        // ArrayList<ZipcodeTO

        String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
        ArrayList<ZipcodeTO> lists = (ArrayList<ZipcodeTO>) jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(ZipcodeTO.class),
                strDong + "%" );
        /*
        for( ZipcodeTO to : lists ) {
            System.out.printf( "[%s] %s %s %s %s %s %n",
                    to.getZipcode(), to.getSido(), to.getGugun(), to.getDong(), to.getRi(), to.getBunji() );
        }
        */
        return lists;
    }

}