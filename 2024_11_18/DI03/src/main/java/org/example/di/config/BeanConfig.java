package org.example.di.config;

import org.example.di.model.MySQLDatabaseDAO;
import org.example.di.model.OracleDatabaseDAO;
import org.example.di.service.DatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("mysql")
    public MySQLDatabaseDAO mySQLDatabaseDAO() {
        return new MySQLDatabaseDAO();
    }


    @Bean("oracle")
    public OracleDatabaseDAO oracleDatabaseDAO() {
        return new OracleDatabaseDAO();
    }

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService();
    }
}
