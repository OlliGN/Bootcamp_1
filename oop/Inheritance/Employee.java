package oop.Inheritance;

//build a project which will be a directory of Employees
public class Employee {

    private String name;
    private String DOB;
    private String title;
    double salary;
    //private Department department;


    public Employee(String name, String DOB, String title, double salary) {
        this.name = name;
        this.DOB = DOB;
        this.title = title;
        this.salary = salary;
    }

    public void login() {
        System.out.println("Welcome, " + name);
    }

    public Number grantBonus() {
        return salary * 0.05;
    }

    //print out title
    private void printTile() {
        System.out.println(title);
    }

    public void promote() {
        salary += 5000;
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

    public static double getW2(double salary){
        return salary  *  0.2;
    }
}
