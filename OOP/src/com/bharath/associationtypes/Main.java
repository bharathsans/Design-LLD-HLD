package com.bharath.associationtypes;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Association Example:
        // Doctor and Patient can exist independently and know each other.
        Doctor doc1 = new Doctor("Dr. Smith", "Cardiology", null);
        Patient patient1 = new Patient("John Doe", Arrays.asList(doc1));
        System.out.println("Association: " + patient1.getName() + " is treated by " + doc1.getName());

        // Aggregation Example:
        // Hospital has Doctors, but Doctors can exist independently.
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Alice", "Neurology", null),
                new Doctor("Dr. Bob", "Orthopedics", null));
        Hospital hospital = new Hospital("City Hospital", doctors);
        System.out.println("Aggregation: " + hospital.getName() + " has doctors like " + doctors.get(0).getName());

        // Composition Example:
        // Library creates and owns its books. Books don't exist outside the library.
        Library library = new Library();
        System.out.println("Composition: Library contains books like " + library.getBooks().get(0).getTitle());

        /*
         * Summary:
         * Association → Independent relationship (Doctor ↔ Patient)
         * Aggregation → Whole-part (Hospital ◇ Doctor), weak lifecycle dependency
         * Composition → Strong ownership (Library ◆ Book), book cannot exist without
         * library
         */
    }
}
