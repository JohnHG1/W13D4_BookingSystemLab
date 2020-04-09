package com.codeclan.example.Booking.System.controllers;


import com.codeclan.example.Booking.System.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerController customerController;

//    @GetMapping(value = "/customer/course")
//    public ResponseEntity<List<Customer>>


}
