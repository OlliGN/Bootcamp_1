package oop.hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalApp {
    public static void main(String[] args) {

        //Patients full name, DOB,  Gender, phone, email, nationality

        Patient patient1 = new Patient("John Doe", "01-20-1990", 'M', "596-233-4543", "Doe@gmail.com", "russian");
        Patient patient2 = new Patient("Steve Jobs","01-01-2020", 'M', "694-34-3243", "steve@gmail.com");
        Patient patient3 = new Patient("Milania Trump", "01-02-1961", 'F', "000-000-0000", "Milania@gmail.com", "serbian");
        Patient patient4 = new Patient("Carolina Hill", "11-02-1990", 'F', "596-133-4500", "Carolina@gmail.com", "ukrainian");
        Patient patient5 = new Patient("Lolla Salmon", "04-04-1990", 'F', "694-34-0001", "Lo343la@gmail.com", "american");
        Patient patient6 = new Patient("Lolla Salmon","11-02-1999", 'F', "694-34-0001", "Lo343la@gmail.com");


        List<Patient> allPatients = new ArrayList<>();
        allPatients.add(patient1);
        allPatients.add(patient2);
        allPatients.add(patient3);
        allPatients.add(patient4);
        allPatients.add(patient5);
        allPatients.add(patient6);


/*
        patient1.orderMedicine("Ibuprofen");
        patient1.payPartialBalance(200);
        patient1.printAllInfo();

        patient1.setGender('M');
        System.out.println(patient1.getGender());

        patient4.setDOB("12-12-1990");

 */

        System.out.println(patient1.getBalance());
        patient1.orderMedicine("Advil");
        System.out.println(patient1.getBalance());
        //without creating any objects we are able to access static members
        Patient.advilPrice = 20;
        patient1.orderMedicine("Advil");
        System.out.println(patient1.getBalance());

        patient5.setPhone("760-123");
        System.out.println(patient5.getPhone());



    }
}
