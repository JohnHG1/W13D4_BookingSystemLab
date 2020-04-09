package com.codeclan.example.Booking.System.controllers;


import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity findAllCoursesByRating(
            @RequestParam(required = false, name = "rating") Integer rating){
        if (rating != null){
            return new ResponseEntity(courseRepository.findByStarRating(rating), HttpStatus.OK);
        }
        return new ResponseEntity(courseRepository.findAll(),HttpStatus.OK);
    }




}
