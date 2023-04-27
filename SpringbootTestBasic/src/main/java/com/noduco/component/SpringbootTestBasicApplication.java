package com.noduco.component;

import com.noduco.component.models.CollegeStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringbootTestBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestBasicApplication.class, args);
    }

    @Bean(name = "collegeStudent")
    @Scope(value = "prototype")
    CollegeStudent getCollegeStudent() {
        return new CollegeStudent();
    }

}
