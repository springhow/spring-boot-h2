package com.springhow.examples.h2database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootH2DatabaseApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2DatabaseApplication.class, args);
    }

}
