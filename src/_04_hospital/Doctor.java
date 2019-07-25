package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patient= new ArrayList<>();
	void addPatient(Patient p) throws DoctorFullException {
		if(patient.size()<3) {
			patient.add(p);
		}
		else {
			throw new DoctorFullException();
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
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patient.size(); i++) {
			patient.get(i).checkPulse();
		}
	}
}
