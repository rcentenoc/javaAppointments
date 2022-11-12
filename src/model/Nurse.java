package model;

public class Nurse extends Employe {
	public Nurse (String name, String email, String speciality ){
		super(name, email, speciality);
	}
	@Override
	public void showDataUser() {
		System.out.println("Nurse: "+getName()+"\nEmail: "+getEmail()+"\nSpeciality: "+getSpeciality());		
	}
}
