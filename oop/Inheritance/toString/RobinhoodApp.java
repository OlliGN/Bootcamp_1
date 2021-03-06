package oop.Inheritance.toString;

import java.util.ArrayList;
import java.util.List;

public class RobinhoodApp {

    public static void main(String [] args){
        Stock tsla = new Stock(841.12,"TSLA", 7000000000000.00);

        System.out.println(tsla);

//        List<String> strings = new ArrayList<>();
//        strings.add("fd");
//        strings.add("fds");
//        strings.add("fddss");
//        strings.add("fddsd");
//        strings.add("f222d");
//
//        String[] arr = {"121", "232", "232"};
//
//        System.out.println(arr);
//        System.out.println(strings);
//
//        print(tsla);
    }
    public static void print(Stock stock){
        System.out.println(stock.getSymbol());
        System.out.println(stock.getCloseHigh());
        System.out.println(stock.getVolume());
    }
}
/*
Requirements

1.RobinhoodApp class should store all of the stocks creates in the app
2.RobinhoodApp should have a method called closeMarket()
3.Stock class should also have a method marketClose()
4.When market closed the stocks should have valid closeHigh and closeLow values
5.Stock history should populated with the current date and closeHigh value.
6.Volume could be set to 0 and ready for the next day and current price stays the same.
 */