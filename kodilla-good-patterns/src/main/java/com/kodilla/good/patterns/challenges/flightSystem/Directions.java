package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Directions {
    private Departure departure;
    private String arrival;

    public Directions(Departure departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    protected static Map<Departure, Arrival> getDirections() {
        Map<Departure, Arrival> directions = new HashMap<>();
        directions.put(new Departure("WAR"), new Arrival("MIA"));
        directions.put(new Departure("KRK"), new Arrival("LAX"));
        directions.put(new Departure("JFK"), new Arrival("LAX"));
        directions.put(new Departure("SDU"), new Arrival("WAR"));
        directions.put(new Departure("SYD"), new Arrival("HKG"));
        directions.put(new Departure("MSK"), new Arrival("KRK"));
        directions.put(new Departure("MXC"), new Arrival("JFK"));
        return directions;
    }

    protected static void flightRadar() {
        Optional<Departure> airports = getDirections().entrySet().stream()
                .filter(s -> "WAR".equals(s.getValue()))
                .map(Map.Entry::getKey)
                .findAny();
        Optional<Arrival> arrivalAirports = getDirections().entrySet()
                .stream()
                .filter(a -> "JFK".equals(a.getKey()))
                .filter(a -> "JFK".equals(a.getValue()))
                .map(Map.Entry::getValue)
                .findAny();
    }
}
