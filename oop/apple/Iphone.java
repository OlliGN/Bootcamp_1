package oop.apple;

import java.util.ArrayList;
import java.util.List;

//Create a program that mimics Iphone
//once user buy an Iphone we will create a new Iphone object
//A a method which can add, buy apps from AppStore

public class Iphone {
    private String model;
    private int memory;
    private String color;
    //Instance variable that defines that Iphone will have list of IosApplications
    private List<IosApp> apps;
    private Battery battery;
    private List<Contact> contactList;

    //in order to create an iphone you only need provide model, memory, battery, color
    //default apps will be appStore, faceTime, calendar
    //default contacts are empty


    public Iphone(String model, int memory, String color, Battery battery) {
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.battery = battery;
        this.apps = new ArrayList<>();
        this.contactList = new ArrayList<>();

        //we cam call instance methods in a constructors
        addDefaultApps();
        showAllApps();


    }

    //declared it private -> bc this method will be used only inside this class
    private void addDefaultApps() {
        IosApp appStore = new IosApp("AppStore", "1.4.3", 1.34, 0);
        IosApp faceTime = new IosApp("FaceTime", "2.2.3", 2.4, 0);
        IosApp calendar = new IosApp("calendar", "3.3.3", 0.4, 0);
        this.apps.add(appStore);
        this.apps.add(faceTime);
        this.apps.add(calendar);
    }

    //add a functionality for Iphone which will add new apps from appStore
    public void downloadNewApp(String appName, AppStore appStore) {
        for (IosApp app : appStore.getApps()) {
            if (app.getName().equalsIgnoreCase(appName)) {
                apps.add(app);
            }
        }
    }

    //add the method that will show all the apps
    public void showAllApps() {
        for (IosApp app : apps) {
            System.out.print(" || " + app.getName());
        }
        System.out.println();
    }

    public Battery getBattery() {
        return battery;
    }
}
