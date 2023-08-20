package com.bootcoding.patientApp.patient.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PatientService {
    public static String newPatient() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();

    }

    public List<String> getNewPatients(int noOfPatients) {
        List<String> patients = new ArrayList<>();
        for(int i = 0; i < noOfPatients; i++){
            String newPatient = newPatient();
            patients.add(newPatient);
        }
        return patients;

    }
}
