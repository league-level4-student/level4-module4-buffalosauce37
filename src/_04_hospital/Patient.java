package _04_hospital;

public class Patient {
	boolean caredFor = false;

	public Object feelsCaredFor() {
		return this.caredFor;
	}

	public void checkPulse() {
		caredFor = true;
	}

}
