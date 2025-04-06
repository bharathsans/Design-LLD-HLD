package com.bharath.associationtypes;

import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name, List<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }
}
