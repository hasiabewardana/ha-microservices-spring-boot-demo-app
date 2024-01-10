package com.example.ha_microservices_spring_boot_demo_app.course_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// Controller class
@RestController
public class CourseController {
    // Controller method
    @RequestMapping("/course")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "AWS Academy"),
                new Course(2, "Java", "Java Academy"),
                new Course(3, "Spring", "Spring Academy")
        );
    }
}