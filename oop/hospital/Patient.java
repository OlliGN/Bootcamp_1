package oop.hospital;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    //Patients, DOB, Full Name, Gender, phone, email, nationality

    // static final int MAX
    //static variables are global variables

    //instance initializer
    //Purpose - to initialize all instance variables that have default values( default to your application)
    //runs once per each object
    //2
    // 2nd to run
    {
        nationality = "American";
        DOB = "xx-xx-xxx";
        System.out.println("Instance Initializer");

    }
    //to initialize static variables
    //runs once per program when the first object from this class is created
    //1
    //First thing to run
    static{
        ibuprofenPrice = 120;
        advilPrice = 10;
        hallsPrice = 5;
        System.out.println("Static Initializer");
    }

    static int ibuprofenPrice;
    static int advilPrice;
    private static int hallsPrice;

    //3
    //3rd one to run

    private String fullName;
    private String DOB;
    private char gender;
    private String phone;
    private String email;
    private String nationality;
    private double balance;
    private boolean isMarried;


    public Patient(String fullName, String DOB, char gender, String phone, String email, String nationality) {
        this.fullName = fullName;
        this.DOB = DOB;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.nationality = nationality;
    }

    public Patient(String fullName, String DOB, char gender, String phone, String email) {
        //way1
        //calls another constructor ---> this()
        this(fullName, DOB, gender, phone, email, "American");

        //way 2
        //this.fullName = fullName;
        //this.DOB = "xx/xx/xxxx";
        //this.gender = gender;
        //this.phone = phone;
        //this.email = email;

        //hard coded value
        //this.nationality = "American";
    }

    public Patient(String fullName, char gender, String phone, String email, String nationality) {
        this(fullName, "xx-xx-xxxx", gender, phone, email, nationality);
    }

    //give an ability to create a Patient Object without DOB and without nationality
    public Patient(String fullName, char gender, String phone, String email) {
        this(fullName, "xx-xx-xxxx", gender, phone, email);
    }

    //Instance variable are available
    //Prints out full info about a patient
    public void printAllInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("BOB: " + DOB);
        System.out.println("Nationality: " + nationality);
        System.out.println("Phone Number: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Balance: " + balance);
    }

    public int getAge() {
        int year = Integer.parseInt(DOB.substring(DOB.lastIndexOf("/" + 1)));
        return 2021 - year;
    }

    //change phone number
    public void changeNumber(String phone) {

        this.phone = phone;
    }

    //updates balance
    public void orderMedicine(String medicine) {
        switch (medicine) {


            case "Ibuprofen":
                this.balance += ibuprofenPrice;
                break;
            case "Advil":
                this.balance += advilPrice;
                break;
            case "Halls":
                this.balance += hallsPrice;
                break;
            default:
        }
    }

    //method payPartialBalance
    public void payPartialBalance(double amount) {
        if (amount > this.balance) {
            System.out.println("You gave us : $" + amount + " but your balance is " + this.balance);
            amount -= this.balance;
            System.out.println("Your change is " + amount);
            this.balance = 0;
        } else {
            this.balance -= amount; //
        }
    }

    //setter ---> is a method that updates the value of a variable.(mutator)
    //set ---> requires void
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == ' ') {
            this.gender = gender;
        } else {
            System.out.println("No such gender exists: " + gender);
        }
    }

    //getter ---> is a method that reads the value of a variable.(accessor)
    public char getGender() {
        return gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) { //Homework :  write a logic for phone format ddd-ddd-dddd
        if (phone.length() == 12) {
            boolean checkPhone = Character.isDigit(phone.charAt(0))
                    && Character.isDigit(phone.charAt(1))
                    && Character.isDigit(phone.charAt(2))
                    && phone.charAt(3) == '-' && Character.isDigit(phone.charAt(4))
                    && Character.isDigit(phone.charAt(5))
                    && Character.isDigit(phone.charAt(6))
                    && phone.charAt(7) == '-'
                    && Character.isDigit(phone.charAt(8))
                    && Character.isDigit(phone.charAt(9))
                    && Character.isDigit(phone.charAt(10))
                    && Character.isDigit(phone.charAt(11));
            if (checkPhone) {
                this.phone = phone;
            }
        } else {
            System.out.println("Enter valid number!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}

