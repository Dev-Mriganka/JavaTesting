package com.noduco.component.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CollegeStudent implements Student{

    private String firstname;
    private String lastname;
    private String emailAddress;
    private StudentGrades studentGrades;

    @Override
    public String studentInformation() {
        return getFullName() + " " + getEmailAddress();
    }

    @Override
    public String getFullName() {
        return getFirstname() + " " + getLastname();
    }

}
