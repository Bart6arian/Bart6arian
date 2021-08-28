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

                if(flightRadar.containsKey(flight.getArrivalAirport()) || flightRadar.containsKey(flight.getDepartureAirport())) {
                    System.out.println("Availability of following airports: \n"+flightRadar.get(flight.getDepartureAirport()) +
                            "\n" +flightRadar.get(flight.arrivalAirport));
                    throw new RouteNotFoundException();
            }
            return flightRadar;
    }

    public static void main(String[] args) {


        try {
            FlightMechanics.findFlight(new Flight("LAX", "ICW"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can not find the airport");
        } finally {
            System.out.println("Please try again");
        }
    }

}
