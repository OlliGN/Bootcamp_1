package oop.Inheritance.human;

public interface Human extends Cycle {
    void eat();

    void rest();

    int run();

    double laugh();
    default  void sayHello(){
        System.out.println("Hello");
    }
}
