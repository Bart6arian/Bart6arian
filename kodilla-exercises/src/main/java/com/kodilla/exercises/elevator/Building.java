package com.kodilla.exercises.elevator;

import java.util.*;

public final class Building {
    private final static int FLOORS = 10;
    private Elevator elevator;
    public static List<Floor> floors = new LinkedList<>();

    public static void fillFloors() {
        System.out.println('\n' + "Floors in building: " + '\n');
        for(int x = 0; x <= FLOORS; x++) {
            floors.add(new Floor(x));
            if(x == 0) {
                System.out.println("Ground floor");
            }
            System.out.println("Floor number: " + x);
        }
        System.out.println();
    }


}
