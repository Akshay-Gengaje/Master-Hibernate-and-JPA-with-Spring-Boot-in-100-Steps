package com.akshay.springbootdemo.controller;

import com.akshay.springbootdemo.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //retrive all courses
    @GetMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28Minutes"),
                new Course(1, "Learn Dev Ops", "in28Minutes")
        );
    }
}
