package model;

import java.util.Date;

public abstract class Employe extends User{
	private String speciality;
	private String area;
	private String hospital;
	private Date admission;
	
	public Employe(String name, String email, String speciality){
		super(name, email);
		this.setSpeciality(speciality);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	public Date getAdmission() {
		return admission;
	}

	public void setAdmission(Date admission) {
		this.admission = admission;
	}

	@Override
	public String toString() {
		return super.toString()+" Speciality: "+speciality+"\nArea: "+area+" Hospital: "+hospital+"\nDate of admission: "+admission;
	}
	
	public abstract void showDataUser(); 
}
