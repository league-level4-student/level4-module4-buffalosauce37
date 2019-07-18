package _04_hospital;s

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patient= new ArrayList<>();
	void addPatient(Patient p) {
		if(patient.size()<3) {
			patient.add(p);
		}
	}
	public List<Patient> getPatients() {
	
		return this.patient;
	}
	public Object size() {
		return this.size();
	}
	public Object performsSurgery() {
		return false;
	}
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
}
