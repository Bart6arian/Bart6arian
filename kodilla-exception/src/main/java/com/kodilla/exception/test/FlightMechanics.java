package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMechanics {
    private Flight flight;

    public FlightMechanics(Flight flight) {
        this.flight = flight;
    }

    public static Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightRadar = new HashMap<>();
            flightRadar.put("LAX", true);
            flightRadar.put("WAW", true);
            flightRadar.put("ICW", false);
            flightRadar.put("NPC", false);

            for(Map.Entry<String, Boolean> entry : flightRadar.entrySet()) {
                if((entry.getKey() == flight.getDepartureAirport() == entry.getValue() == false) ||
                entry.getKey() == flight.getArrivalAirport() == entry.getValue() == false) {
                    System.out.println("Airport: " +entry.getKey() +" [not available]\n");
                    throw new RouteNotFoundException();
                }
            }
            return flightRadar;
    }

    public static void main(String[] args) {

        try {
            FlightMechanics.findFlight(new Flight("LAX", "NPC"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can not find the airport");
        } finally {
            System.out.println("Please try again");
        }
    }

}
