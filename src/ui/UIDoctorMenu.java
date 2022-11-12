package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import model.Doctor;

public class UIDoctorMenu {
	public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
	public static void showDoctorMenu() {
		int response =0;
		do {
			System.out.println("\nDoctor\nWelcome "+UIMenu.doctorLogged.getName());
			System.out.println("1. Add available Appointment");
			System.out.println("2. My scheduled Appointment");
			System.out.println("0. Logout");
			
			try (Scanner sc = new Scanner (System.in)){
				response =Integer.valueOf(sc.nextLine());
				switch (response) {
				case 1:
					showAddAvailabaleAppointmentMenu();
					break;
				case 2:
					break;
				case 0:
					UIMenu.showMenu();
					break;
				}
			} catch (Exception e) {
				System.out.println("Error: "+e);
			}
		}while(response!=0);
	}
	
	private static void showAddAvailabaleAppointmentMenu() {
		int response = 0;
		do {
			System.out.println("\n:: Add Available Appointment\n:: Select a Month:");
			for (int i = 0; i < 3; i++) {
				int j = i+1;
				System.out.println(j+". "+UIMenu.MONTHS[i]);
			}
			System.out.println("0. Return");
			try (Scanner sc = new Scanner(System.in)){
				response =Integer.valueOf(sc.nextLine());
				if(response>0&&response<4) {
					int monthSelected = response;
					System.out.println(monthSelected+" . "+UIMenu.MONTHS[monthSelected-1]);
					System.out.println("Inser the date available: [dd/mm/yyyy]");
					String date = sc.nextLine();
					System.out.println("Your date is: "+date+"\1. Correct\n2.Change date");
					int responseDate = Integer.valueOf(sc.nextLine());
					if(responseDate==2) continue;
					String time = "";
					int responseTime = 0; 
					do {
						System.out.println("Insert the time available for date: "+date+"[16:00]");
						time = sc.nextLine();
						System.out.println("Your time is: "+time+"\n1. Correct\2. Change date");
						responseTime=Integer.valueOf(sc.nextLine());
					}while(responseTime ==2);
					UIMenu.doctorLogged.addAvailableAppointment(date,time);
					chekDoctorAvailableAppointments(UIMenu.doctorLogged);
					
				}else if(response==0) {
					showDoctorMenu();
				}
			} catch (Exception e) {
				System.out.println("Error: "+e);
			}
		}while(response != 0);
	}
	
	private static void chekDoctorAvailableAppointments(Doctor doctor) {
		if (doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)) {
			doctorsAvailableAppointments.add(doctor);
		}
	}
	
	
}
