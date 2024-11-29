package org.example.di.service;

import org.example.di.model.DatabaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service("service")
public class DatabaseService {

    // 필드주입
    @Autowired
    @Qualifier("mysql")
    private DatabaseDAO databaseDAO;

    public List<String> getList() {
        return databaseDAO.list();
    }
}
