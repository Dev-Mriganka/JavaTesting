package com.noduco.gradebook.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
public class ScienceGrade implements Grade {

    @Id
    private int id;
    private int studentId;
    private double grade;

    public ScienceGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double getGrade() {
        return grade;
    }

}
