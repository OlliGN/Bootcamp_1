package oop.hotel;

import java.util.*;

public class HyattApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //When you have to pass in a collection into a param - good practice is to create it before

        Map<String, Integer> bedTypeMap = new HashMap<>();
        bedTypeMap.put("King", 1);
        Room room1 = new Room(101, 1, 1, bedTypeMap, true);
        // System.out.println(room1.isAvailable);
        // System.out.println(room1.beds);
        // System.out.println(room1.baths);

        Map<String, Integer> bedTypeMap2 = new HashMap<>();
        bedTypeMap2.put("King", 1);
        bedTypeMap2.put("Queen", 1);
        Room room2 = new Room(102, 2, 1, bedTypeMap2, true);

        Map<String, Integer> bedTypeMap3 = new HashMap<>();
        bedTypeMap3.put("King", 2);
        Room room3 = new Room(103, 2, 2, bedTypeMap3, true);

        Map<String, Integer> bedTypeMap4 = new HashMap<>();
        bedTypeMap4.put("Queen", 2);
        Room room4 = new Room(104, 1, 1, bedTypeMap4, true);

        Map<String, Integer> bedTypeMap5 = new HashMap<>();
        bedTypeMap5.put("Queen", 1);
        bedTypeMap5.put("King", 2);
        Room room5 = new Room(105, 3, 2, bedTypeMap5, true);

        //HOMEWORK 01/27/2020

        List<Room> allRooms = new ArrayList<>();
        allRooms.add(room1);
        allRooms.add(room2);
        allRooms.add(room3);
        allRooms.add(room4);
        allRooms.add(room5);

        System.out.println("Welcome to Hyatt!");
        System.out.println("How many beds?");
        int beds = sc.nextInt();
        System.out.println("How many baths?");
        int baths = sc.nextInt();

        bookRoom(allRooms, beds, baths);

        System.out.println("Which room would you like to book?");
        int roomNumber = sc.nextInt();

        bookTheRoom(allRooms, roomNumber);
    }

    public static List<Room> bookRoom(List<Room> allRooms, int beds, int baths) {
        for (int i = 0; i < allRooms.size(); i++) {
            if (allRooms.get(i).isAvailable && beds == allRooms.get(i).beds && baths == allRooms.get(i).baths) {
                System.out.println("Room number " + allRooms.get(i).number + " which is "
                        + allRooms.get(i).beds + " bd, "
                        + allRooms.get(i).baths + " baths, and "
                        + allRooms.get(i).bedTypes.keySet()
                        + " bed(s) is available");
            }
        }
        return allRooms;
    }

    public static void bookTheRoom(List<Room> allRooms, int roomNumber) {
        for (int i = 0; i < allRooms.size(); i++) {
            if (allRooms.get(i).number == roomNumber && allRooms.get(i).isAvailable) {
                System.out.println("You successfully book the room # " + roomNumber);
                allRooms.get(i).isAvailable = false;
            }
        }
    }
}
