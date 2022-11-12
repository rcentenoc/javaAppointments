package model;

public abstract class User {
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	
	public User(String name, String email) {
		this.setName(name);
		this.setEmail(email);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if((phoneNumber.length()>8)||(phoneNumber.length()<8)){
			System.out.println("El número telefonico debe ser de 8 digitos");
		}else{
			this.phoneNumber = phoneNumber;			
		}
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return "User: "+name+" Email: "+email+"\nAddress: "+address+" Phone: "+phoneNumber;
	}
	
	public abstract void showDataUser();
}
