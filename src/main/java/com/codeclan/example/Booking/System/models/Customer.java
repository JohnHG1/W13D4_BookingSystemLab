package com.codeclan.example.Booking.System.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int age;
    private String town;
    private List<Booking> bookings;

    public Customer(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
