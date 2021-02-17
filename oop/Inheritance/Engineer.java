package oop.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends Employee {
    List<String> tools = new ArrayList<>();


    private boolean isOnTarget;
    public double salary;

    public Engineer(String name, String DOB, String title, double salary) {

        //Inheritance helps us inherit variables and method from Parent class
        //Employee is a superclass (parent class)
        //Engineer is a subclass (child class)

        // calling a constructor from the direct superclass
        super(name, DOB, title, salary);
        super.salary = salary;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public void promote() {
        super.salary += 10000;
    }

    @Override
    public Double grantBonus() {
        return salary * 0.2;
    }

    public void printTitle(){
        System.out.println(getTitle());
    }

    public Double bonus() {
        if (isOnTarget) {
            return grantBonus();
        } else {
            return (Double) super.grantBonus();
        }
    }

    public void setOnTarget(boolean isOnTarget) {
        this.isOnTarget = isOnTarget;
    }

    //same rules as overriding instance methods, we call it method hiding
    public static double getW2(double salary){
        return salary  *  0.20;
    }

}

/*
public class Engineer {
    private String name;
    private String DOB;
    private String title;
    private double salary;
    List<String> tools = new ArrayList<>();

    public Engineer(String name, String DOB, String title, double salary) {
        this.name = name;
        this.DOB = DOB;
        this.title = title;
        this.salary = salary;
        this.tools = tools;
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
    } */
