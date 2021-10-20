package com.kodilla.exercises.elevator;

import java.util.*;

public class Floor implements Queue {
    private static int floorNum;
    private final static int FLOORS = 10;

    public Floor(int floorNum) {
        Floor.floorNum = floorNum;
    }

    public static void setFloorNum(int floorNum) {
        floors2Go.add(floorNum);
    }

    public static int getFloorNum() {
        return floors2Go.get(0);
    }

    public static List<Integer> floors2Go = new LinkedList<>();
    public static List<Integer> numberOfPeople = new LinkedList<>();
    public static List<Integer> peopleQueue = new LinkedList<>();

    public static void generateRand() {
        Random random = new Random();
        int randomFloor = random.nextInt(FLOORS);
        for(int x = 0; x < 5; x++) {
            floors2Go.add(x, randomFloor);
        }
    }

    public static void floorSignal() {
        int floor = floors2Go.get(0);
        if(floor > 0) {
            System.out.println("[Signal from floor: " + floor + "]");
        } else
            System.out.println("[Signal from Ground floor]");
    }

    @Override
    public List<Integer> people() {
        Random random = new Random();
        int people = random.nextInt(9)+1;

        int floorNum = floors2Go.get(0);

        for(int x = 1; x <= people; x++) {
            numberOfPeople.add(x);
        }

        if(numberOfPeople.size() > 6) {
            for(int c = 1; c <= (numberOfPeople.size() -6); c++) {
                peopleQueue.add(c);
            }
        }
        System.out.println('\n'+"People waiting: "+ numberOfPeople.size()
                +" on floor: " + floorNum);
        return numberOfPeople;
    }

    public void queueFloor() {
        if(peopleQueue.size() >= 1) {
            System.out.println(peopleQueue.size()
                    + " people in queue on floor [" + floors2Go.get(0)+"]");
        }
    }

}
