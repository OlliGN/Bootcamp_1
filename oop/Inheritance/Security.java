package oop.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Security extends Employee {
    private String name;
    private String DOB;
    private String title;
    private double salary;
    List<String> combatSkills = new ArrayList<>();

    public Security(String name, String DOB, String title, double salary) {
        super(name, DOB, title, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getCombatSkills() {
        return combatSkills;
    }

    public void setCombatSkills(List<String> combatSkills) {
        this.combatSkills = combatSkills;
    }
    //way 1 (overloading)
        //this is overloading, bc login is inherited from employee class
       //public void login(String name) {
      //  System.out.println("Welcome, thanks for keeping us safe, " + getName());
     // }
    // helps to make sure that we overriding

    // way 2 (overriding)
    @Override
    public void login() {
        System.out.println("Welcome, thanks for keeping us safe, " + getName());
    }
}
