package com.harbour.springintroduction.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("myconfig.xml");

        System.out.println("Context is ready");

        final var harbourTeacher = (Teacher)context.getBean("harbourTeacher");
        final var course= (Course)context.getBean("harbourCourse");

        System.out.println(harbourTeacher.getName());
        System.out.println(course.getTeacherName());
    }

}
