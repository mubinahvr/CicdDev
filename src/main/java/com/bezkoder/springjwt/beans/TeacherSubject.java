package com.bezkoder.springjwt.beans;

import org.springframework.context.annotation.Bean;


public class TeacherSubject {
    private String teacherName;
    private int academicYear;
    private String subjectName;

    // Getters and setters
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}

