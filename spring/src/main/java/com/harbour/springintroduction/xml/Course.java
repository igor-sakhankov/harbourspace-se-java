package com.harbour.springintroduction.xml;

public class Course {

    private final Teacher teacher;

    public Course(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacher.getName();
    }
}
