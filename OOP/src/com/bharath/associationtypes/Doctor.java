package com.bharath.associationtypes;

import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization, List<Patient> patients) {
        this.name = name;
        this.specialization = specialization;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
