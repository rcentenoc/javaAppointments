import java.util.Date;

import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.Nurse;
import model.User;
import static ui.UIMenu.*;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Ornella Centeno","orne@gmail.com","Médico Cirujano","01234578");
		myDoctor.addAvailableAppointment("24/11/2022", "4:00 pm");
		myDoctor.addAvailableAppointment("02/12/2022", "5:00 pm");
		myDoctor.addAvailableAppointment("15/11/2022", "5:30 pm");
		
		System.out.println(myDoctor);
		
		System.out.println("\n");
		
		Doctor myDoctorAnn = new Doctor("Audrey Aramburú","audara@gmail.com","Dermatólogo","45879856");
		System.out.println(myDoctorAnn);
		Doctor otherDoctor0 = new Doctor("Paula Cardenas","pau@gmail.com","Médico especialista","02457896");
		System.out.println(otherDoctor0);
		System.out.println("\n");	
		Patient patient0 = new Patient("Alessandra","ale@gmail.com");
		patient0.setWeight(54.5);
		patient0.setHeight(1.60);
		System.out.println(patient0.getWeight());
		System.out.println(patient0.getHeight());
		System.out.println(patient0);
		
		Nurse Nurse0 = new Nurse("Fernando Gallardo","fer@gmail","Cuidados intensivos");
		Nurse0.showDataUser();
		
		/*CLASE ANONIMA*/
		User user1 = new User("Fabian Wiesse","fab@gmail.com") {
			@Override
			public void showDataUser() {
				System.out.println("\nVisitante\n"+"Nombre: "+getName()+"\nEmail: "+getEmail());
			}
		};
		
		user1.showDataUser();
		
		/*CLASE ANONIMA de una interfaz*/
		ISchedulable i1 = new ISchedulable() {
			public void schedule(Date date, String time) {
				
			}
		};		
		showMenu();
	}
}
