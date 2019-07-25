package _04_hospital;

import java.util.ArrayList;
import java.util.Random;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList();
	
	ArrayList<Doctor> getDoctors() {
		return this.doctors;
		
	}
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Patient> getPatients() {
		return this.patients;
	}
	void addPatient(Patient p) {
		patients.add(p);
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}
}
