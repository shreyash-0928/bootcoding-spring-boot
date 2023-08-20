package com.bootcoding.patientApp.patient.controller;

import com.bootcoding.patientApp.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("all-patients")
    public List<String> getAllPatients() {
        int NoOfPatients = 10;
        return patientService.getNewPatients(NoOfPatients);
    }

    @GetMapping("patient/{name}")

    public String getPatientObjectById(@PathVariable("name") String patientName) {
        String patient = PatientService.newPatient();
        return patient;
    }
}
