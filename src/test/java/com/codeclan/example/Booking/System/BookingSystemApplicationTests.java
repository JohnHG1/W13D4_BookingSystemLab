package com.codeclan.example.Booking.System;

import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.models.Customer;
import com.codeclan.example.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Booking.System.repositories.CourseRepository;
import com.codeclan.example.Booking.System.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllCoursesByRating(){
		List<Course> foundCourse = courseRepository.findByStarRating(4);
		assertEquals(1,foundCourse.size());
	}

	@Test
	public void canFindCustomerByCourse(){
		List<Customer> foundCustomers = customerRepository.findByBookingCourseId(1L);
		assertEquals(2, foundCustomers.size());
	}

}
