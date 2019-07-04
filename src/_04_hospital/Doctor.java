package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	ArrayList<Patient> patient= new ArrayList<>();
	void addPatient(Patient p) {
		if(patient.size()<3) {
			patient.add(p);
		}
	}
	public List<Patient> getPatients() {
	
		return this.patient;
	}
}
