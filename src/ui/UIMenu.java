package ui;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {
	
	public static Doctor doctorLogged;
	public static Patient patientLogged;
	public static final String[] MONTHS = {
			"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"
	};
	
	public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");
        
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                	response = 0;
                	authUser(1);
                    System.out.println("Doctor");
                    break;
                case 2:                	
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
    
    private static void authUser(int userType) {
    	ArrayList<Doctor> doctors = new ArrayList<>();
    	doctors.add(new Doctor("Maricielo Alegría","mar@gmail.com","Odontología","12345678"));
    	doctors.add(new Doctor("Roberto Siciliano","ro@gmail.com","Traumatología","01234567"));
    	doctors.add(new Doctor("Rick Townsen","ric@gmail.com","Cabeza y cuello","00123456"));
    	ArrayList<Patient> patients = new ArrayList<>();
    	patients.add(new Patient("Alessandra Tamayo","ale@gmail"));
    	patients.add(new Patient("Gabriela Cogci","gab@gmail"));
    	patients.add(new Patient("Carlos Mosquera","car@gmail"));
    	
    	boolean emailCorrect =false;
    	do {
    		System.out.println("Insert your email: ");
    		try (Scanner sc = new Scanner (System.in)) {
				String email =sc.nextLine();
				if (userType ==1) {
					for (Doctor d: doctors) {
						if(d.getEmail().equals(email)) {
							emailCorrect = true;
							//Obtener el usuario logeado
							doctorLogged = d;
							UIDoctorMenu.showDoctorMenu();
						}
					}
				}
				else if(userType ==2) {
					for(Patient p: patients) {
						if(p.getEmail()==(email)) {
							emailCorrect = true;
							patientLogged = p;
							//showPatientMenu
						}
					}
				}
			}
    	}while(!emailCorrect);
    }
    

    
}
