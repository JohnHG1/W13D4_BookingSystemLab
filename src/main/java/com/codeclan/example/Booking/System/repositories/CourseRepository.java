package com.codeclan.example.Booking.System.repositories;

import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> findByStarRating(int rating);

//    public List<Course> findAllByBookingCustomerId(Long customerId);

}
