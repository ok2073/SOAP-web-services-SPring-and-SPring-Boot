package com.keelient.soap.webservice.coursemanagement.service;

import com.keelient.soap.webservice.coursemanagement.bean.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseDetailsService {

    public enum Status {
        SUCCESS, FAILURE;
    };

    private static List<Course> courses = new ArrayList<>();

    static{
        Course course1 = new Course(1, "Spring", "10 steps");
        Course course2 = new Course(2, "Spring MVC", "10 examples");
        Course course3 = new Course(3, "Spring Boot", "6k students");
        Course course4 = new Course(4, "Maven", "most popular maven course");

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
    }

    public Course findById(int id) {
        return courses.stream()
                .filter(course -> course.getId() == id)
                .findFirst() // Returns Optional<Course>
                .orElse(null); // Return n

    }

    public List<Course> findall() {
        return courses;
    }

    public Status deleteById(int id) {
        return courses.stream()
                .filter(course -> course.getId() == id)
                .findFirst()
                .map(course -> Status.SUCCESS) // Return 1 if course found and deleted
                .orElse(Status.FAILURE); // Return 0 if not found
    }
}
