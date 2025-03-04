package com.generation.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        if(!isAttendingCourse(course.getCode())) {
            courses.add(course);
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public isAttendingCourse(String courseCode )
    {
        //TODO implement this method
        //gets courses from courses list
        for(Course courses : courses) {
            //get courses code and see if it equals courseCode
            if(courses.getCode().equals(courseCode)) {
                System.out.println("Student is already enrolled " + courseCode + ".");
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                ", courses=" + courses +
                ", approvedCourses=" + approvedCourses +
                '}';
    }