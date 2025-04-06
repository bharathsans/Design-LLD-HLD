package com.bharath.associationtypes;

import java.util.List;

public class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name, List<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
