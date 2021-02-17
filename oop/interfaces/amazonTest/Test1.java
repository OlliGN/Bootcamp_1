package oop.interfaces.amazonTest;

//interfaces are not required to have methods

import oop.interfaces.BrowserService;
import oop.interfaces.Chrome;
import oop.interfaces.Safari;

import java.util.Locale;

//Dynamic test framework which is able to run against different browsers/different environments

public class Test1 {
    public static void main(String[] args) { //arg ---> application arguments
        //application arguments

        // 0 - for browser type
        // 1- for env
        // 2 - for password

        BrowserService browser = null;

        //open the given browser and navigate the browser to the given environment
        switch (args[0].toLowerCase()) {

            case "chrome":
                browser = new Chrome();
                break;

            case "safari":
                browser = new Safari();
                break;

            default:
                System.out.println("Unsupported browser");
                System.exit(1);
        }

        System.out.println("Opened " + args[0]);

        //polymorphism - ability to take different shapes
        //in Java interface data types can be initialized with objects that implements the difference
        //and this a runtime process
        browser.navigate(args[1]);
        System.out.println(args[0] + " Navigated to " + args[1]);
    }

    public static String getUrl(BrowserService browser) {
        return browser.getUrl();
    }

}
