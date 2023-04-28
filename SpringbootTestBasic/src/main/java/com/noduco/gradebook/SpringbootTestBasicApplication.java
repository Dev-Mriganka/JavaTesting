package com.noduco.gradebook;

import com.noduco.gradebook.dao.ApplicationDao;
import com.noduco.gradebook.models.*;
import com.noduco.gradebook.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringbootTestBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestBasicApplication.class, args);
    }

    @Bean(name = "applicationExample")
    ApplicationService getApplicationService() {
        return new ApplicationService();
    }

    @Bean(name = "applicationDao")
    ApplicationDao getApplicationDao() {
        return new ApplicationDao();
    }

    @Bean(name = "collegeStudent")
    @Scope(value = "prototype")
    CollegeStudent getCollegeStudent() {
        return new CollegeStudent();
    }

}
