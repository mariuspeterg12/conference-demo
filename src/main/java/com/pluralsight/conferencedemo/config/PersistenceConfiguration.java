package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder= DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/conference_demo?characterEncoding=UTF-8");
        builder.username("play11");
        builder.password("Wt0r3k19");
        return builder.build();

    }
}
