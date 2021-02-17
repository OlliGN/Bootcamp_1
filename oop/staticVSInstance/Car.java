package oop.staticVSInstance;

public class Car {
    //instance initializer;
    //the purpose is to initialize default values of instance variables
    {

    }

    //to keep the code cleaner
    private static final String MESSAGE = "Hello Car Buyer";//hard ceded values
    //instance variables - characteristics each car car
    //static variables contains value that is exactly the same for all objects
    public static  int count = 0;
    private long vin;
    private String plateNumber;
    private String make;
    private String model;

    public Car(long vin, String plateNumber, String make, String model) {
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        System.out.println(MESSAGE);
        count++;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        System.out.println(MESSAGE);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
