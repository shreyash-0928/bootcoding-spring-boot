package com.bootcoding.patientApp.patient;

import com.bootcoding.patientApp.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication  implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}

	@Autowired
	private PatientService patientService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String s = patientService.newPatient();
		System.out.println("New patient : " + s);

	}
}
