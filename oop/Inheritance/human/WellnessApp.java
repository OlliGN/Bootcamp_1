package oop.Inheritance.human;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WellnessApp {
    public static void main(String[] args) {
        LocalDateTime start  = LocalDateTime.now();
        System.out.println("Hi! Welcome to DevX Wellness program");
        System.out.println("Before you get started, I need to ask you few questions");
        System.out.println("What is you gender?");
        Scanner sc = new Scanner(System.in);

        //based on the gender - use right class
        char gender = sc.next().charAt(0);

        Human user = null;
        switch (gender) {
            case 'M':
                user = new Man(0, 70);
                break;
            case 'F':
                user = new Women(0, 50);
                break;
        }
        user.eat();
        user.laugh();
        user.rest();
        user.run();
        user.sayHello();
        Health.printHealth();
        System.out.println(Duration.between(start, LocalDateTime.now()).getSeconds());
    }
}
