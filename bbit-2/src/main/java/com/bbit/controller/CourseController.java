package com.bbit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="courses")

//public class CourseController<Course> {
//    private final CourseRepository courseRepository;
//
//    public CourseController(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//
//
//    }
//}
public class CourseController<Course>{
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}