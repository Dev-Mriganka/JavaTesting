package com.noduco.gradebook;

import com.noduco.gradebook.models.CollegeStudent;
import com.noduco.gradebook.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReflectionTestUtilsTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    CollegeStudent studentOne;

    @Autowired
    StudentGrades studentGrades;

    @BeforeEach
    public void studentBeforeEach() {
        studentOne.setFirstname("Mriganka");
        studentOne.setLastname("Mondal");
        studentOne.setEmailAddress("mrigankamondal@noduco.com");
        studentOne.setStudentGrades(studentGrades);

        ReflectionTestUtils.setField(studentOne, "id", 1);
        ReflectionTestUtils.setField(studentOne, "studentGrades",
                new StudentGrades(new ArrayList<>(Arrays.asList(
                        100.0, 85.0, 76.50, 91.75))));
    }

    @Test
    void getPrivateField() {
        assertEquals(1, ReflectionTestUtils.getField(studentOne, "id"));
    }

    @Test
    void invokePrivateMethod() {
        assertEquals("Mriganka 1",
                ReflectionTestUtils.invokeMethod(studentOne, "getFirstNameAndId"),
                "Fail private method not call");
    }
}