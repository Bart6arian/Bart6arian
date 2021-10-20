package com.kodilla.exercises.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.kodilla.exercises.elevator.Floor.floors2Go;
import static com.kodilla.exercises.elevator.Floor.getFloorNum;

public class Elevator {
    private final String elevatorID;
    private Floor floor;
    private static final int MAX_PASSENGERS = 6;
    private static final long MOVEMENT_CYCLE = 1500;

    public Elevator(String elevatorID) {
        this.elevatorID = elevatorID;
    }

    public String getElevatorID() {
        return elevatorID;
    }

    public void msg() {
        System.out.println("People in elevator: " + peopleInElev.get(peopleInElev.size()-1));
    }

    public static List<Integer> peopleInElev = new ArrayList<>();
    public static List<Integer> movements = new ArrayList<>();

    public boolean elevatorCapacity(int gg) {
        boolean result = false;

        if(gg >= 0) {
            if (Floor.numberOfPeople.size() == MAX_PASSENGERS) {
                for (int p = 1; p <= MAX_PASSENGERS; p++) {
                    peopleInElev.add(p);
                    result = true;
                }
            } else {
                if (Floor.numberOfPeople.size() > MAX_PASSENGERS) {
                    for (int x = 1; x <= MAX_PASSENGERS; x++) {
                        peopleInElev.add(x);
                        result = true;
                    }
                } else {
                    for(int i = 1; i <= Floor.numberOfPeople.size(); i++) {
                        peopleInElev.add(i);
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    public int elevatorStartPosition() {
        Random random = new Random();
        int start = random.nextInt(11);
        System.out.println("Elevator " + getElevatorID() + " is on floor: " +start);
        return start;
    }

    public void removePeople() {
        System.out.println(peopleInElev.size() + " people removed elevator");
        peopleInElev.clear();
    }


    public boolean service() throws InterruptedException {
        boolean service = false;
        if(movements.size() == 50) {
            removePeople();
            service = true;
            Thread.sleep(5000);
            System.out.println("Service on elevator ID ["+getElevatorID()+"]");
            setElevatorNewPos();
        }
        return service;
    }

    public void setElevatorNewPos() throws InterruptedException {
        int go = Floor.floors2Go.get(0);
        int gg = elevatorStartPosition();
        if(go > gg) {
            for(int x = gg; x <= go; x++) {
                Thread.sleep(MOVEMENT_CYCLE);
                System.out.println("Elevator (" + getElevatorID() + ") passed [" + x + "] floor");
                movements.add(x);
                if (x == go) {
                    elevatorCapacity(gg);
                    floors2Go.remove(0);
                    Floor.setFloorNum(go);
                }
            }
        } else {
            if(go < gg) {
                for(int c = gg; c >= go; c--) {
                    Thread.sleep(MOVEMENT_CYCLE);
                    System.out.println("Elevator (" + getElevatorID() + ") passed [" + c + "] floor");
                    movements.add(c);
                    if(c == go) {
                        elevatorCapacity(gg);
                        floors2Go.remove(0);
                        Floor.setFloorNum(go);
                    }
                }
            } else
                System.out.println("Elevator (" + getElevatorID() + ") is on the same floor");
                Thread.sleep(500);
                elevatorCapacity(gg);
                floors2Go.remove(0);
                Floor.setFloorNum(go);
        }
    }

    public void newOrder() {
        int nextFloor = floors2Go.get(0);
        System.out.println("New order on floor " + nextFloor);
        if(nextFloor < getFloorNum()) {

        }
    }

    public void elevNewPosition() {
        System.out.println('\n'+"Elevator ("+getElevatorID()+") is on floor: " + getFloorNum());
        msg();
    }
}
