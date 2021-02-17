package oop.Inheritance;

public class DirectoryApp {
    public static void main(String[] args) {
        Employee elon = new Employee("Elon", "12-12-1234", "CEP", 100000);
        Engineer johnDoe = new Engineer("John Doe", "01-13-1284", "Software Engineer", 127000);
        Security jetLee = new Security("Jet Lee", "12-23-1990", "Security", 123121);

        System.out.println(elon.getDOB());
        System.out.println(johnDoe.getDOB());
        johnDoe.promote();
        System.out.println(johnDoe.grantBonus());

        //a variable has a data type and a value

        //polymorphism -> ability to take different forms
        Employee employee = new Engineer("Kex","02/12/2018", "Cat Engineer", 700000);

       // Engineer e = new Security("Ray", "12-12-1998", "security", 100000); --> ERROR

        //only methods from the data of a variable will be available to execute
        System.out.println(employee.salary);



    }
}
