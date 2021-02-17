package oop.apple;

public class IosApp {
    private String name;
    private String version;
    private double memorySize;
    private double prise;
    private boolean isOpen;

    public IosApp(String name, String version, double memorySize, double prise) {
        this.name = name;
        this.version = version;
        this.memorySize = memorySize;
        this.prise = prise;
        this.isOpen = false;
    }

    //we want to be able to open apps that we have on Iphone
    public void open() {
        System.out.println("Opened " + name + " application!");
        isOpen = true;
    }
    public void closed(){
        System.out.println("Closed " + name + " application!");
        isOpen = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    //we will use it to check if the app is open
    public boolean isOpen() {
        return isOpen;
    }
}
