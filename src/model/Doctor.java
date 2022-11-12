package model;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Doctor extends Employe{
	
	private String collegeNumber;
	
	public Doctor(String name, String email, String speciality, String collegeNumber){
		super(name, email, speciality);
	}
	
	public String getCollegeNumber() {
		return collegeNumber;
	}
	public void setCollegeNumber(String collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nAVAILABLE\n"+availableAppointments.toString();
	}
	
	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		
	}
	
	/*Colección de objetos
	 * Objetos del tipo <AvailableAppointment>
	 * availableAppointments es el nombre de la colección
	 * new ArrayList<>() esta es la forma de instanciar la colección
	 * 
	 * */
	ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
	public void addAvailableAppointment(String date, String time){
		
		availableAppointments.add(new AvailableAppointment(date,time));
	}
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointments;
	}
	
	public static class AvailableAppointment {
		private int id=0;
		private Date date;
		private String time;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		public AvailableAppointment(String date, String time) {
			try {
				this.date = format.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			this.time = time;
		}
		
		
		public Date getDate() {
			return date;
		}
		
		public String getDate(String DATE) {
			return format.format(date);
		}
		
		public void setDate(Date date) {
			this.date = date;
		}
		
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "\nDate: "+date+"\nTime: "+time+"\n";
		}
			
	}
	
}
