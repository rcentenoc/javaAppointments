package model;

public class AppointmentNurse extends Appointment{
	private Nurse nurse;

	public Nurse getNurse() {
		return nurse;
	}
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
}
