package oop.staticVSInstance;

public class Demo {
    public static void main(String[] args){
        Car c = new Car(183578539, "AB12343", "BMW", "N5");
        Car c2 = new Car(1831213239, "nb432243", "BMW", "N5");
        System.out.println(Car.count);
    }
}
