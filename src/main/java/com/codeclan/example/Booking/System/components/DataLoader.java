package com.codeclan.example.Booking.System.components;


import com.codeclan.example.Booking.System.models.Booking;
import com.codeclan.example.Booking.System.models.Course;
import com.codeclan.example.Booking.System.models.Customer;
import com.codeclan.example.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Booking.System.repositories.CourseRepository;
import com.codeclan.example.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Bob",24,"Largs");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jane",28,"Saltcoats");
        customerRepository.save(customer2);

        Course course1 = new Course("Intro to Python","Glasgow",4);
        courseRepository.save(course1);

        Course course2 = new Course("Intro to Java","Edinburgh",3);
        courseRepository.save(course2);

        Course course3 = new Course("Intro to SPSS","Edinburgh",3);
        courseRepository.save(course3);

        Booking booking1 = new Booking("10-05-2020", course1, customer2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("16-05-2020", course1, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("20-05-2020", course2, customer1);
        bookingRepository.save(booking3);


    }

}
