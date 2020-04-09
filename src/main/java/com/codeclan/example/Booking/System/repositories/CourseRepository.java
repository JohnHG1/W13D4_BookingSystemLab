package com.codeclan.example.Booking.System.repositories;

import com.codeclan.example.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
