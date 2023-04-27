package com.noduco.component.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CollegeStudent implements Student{

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;
    private StudentGrades studentGrades;

    public CollegeStudent(String firstname, String lastname, String emailAddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
    }

    @Override
    public String studentInformation() {
        return getFullName() + " " + getEmailAddress();
    }

    @Override
    public String getFullName() {
        return getFirstname() + " " + getLastname();
    }

    private String getFirstNameAndId() {
        return getFirstname() + " " + getId();
    }
}
