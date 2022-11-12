package model;

public class Patient extends User {
	static int id=0;
	private String birthday;
	private double weight;
	private double height;
	private String blood;
	
	public Patient(String name, String email){
		super(name, email);
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getWeight() {
		return this.weight + " kg.";
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getHeight() {
		return this.height + " Mts";
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	@Override
	public String toString(){
		return super.toString()+"\nAge: "+birthday+" Weight: "+getWeight()+" Height: "+getHeight()+" Type of blood: "+blood;
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		
	}
}	
