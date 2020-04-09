package com.codeclan.example.Booking.System.controllers;


import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.models.Customer;
import com.codeclan.example.Booking.System.repositories.CourseRepository;
import com.codeclan.example.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping public ResponseEntity<List<Customer>>getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value = "/customer/course")
//    public ResponseEntity<List<Customer>>


}
