package com.codeclan.example.Booking.System.repositories;

import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public List<Customer> findAllByBookingCourseId(Long courseId);

//    List<Customer> findAllByTownAndBookingCourseId(String town, Long courseId);

//    List<Customer> findAllByTownAndAgeGreaterThanBookingCourseId(String town, int age, Long courseId);



}
