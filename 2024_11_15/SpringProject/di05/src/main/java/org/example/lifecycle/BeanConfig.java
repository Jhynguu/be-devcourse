package org.example.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class BeanConfig {

    @Bean(initMethod = "init_method", destroyMethod = "destroy_method")
    public Action action() {
        WriteAction writeAction = new WriteAction();
        return writeAction;
    }
}
