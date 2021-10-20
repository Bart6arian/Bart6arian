package com.kodilla.exercises.elevator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.kodilla.exercises.elevator.Building.fillFloors;
import static com.kodilla.exercises.elevator.Building.floors;
import static com.kodilla.exercises.elevator.Floor.*;

public class ElevatorRunner {

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator1 = new Elevator("EL345D");
        Elevator elevator2 = new Elevator("EL98C2");
        Elevator elevator3 = new Elevator("EL65B4");
        List<Elevator> elevators = new LinkedList<>();
        elevators.add(elevator1);
        elevators.add(elevator2);
        elevators.add(elevator3);

        fillFloors();
        Random random = new Random();
        int flr = random.nextInt(9);
        Floor floor = floors.get(flr);
        generateRand();

        floorSignal();
        floor.people();
        elevator1.setElevatorNewPos();
        floor.queueFloor();
        elevator1.elevNewPosition();
    }
}
