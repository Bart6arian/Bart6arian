package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.Objects;

public class Departure {
    private String airport;

    public Departure(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Departure)) return false;

        Departure departure = (Departure) o;

        return Objects.equals(airport, departure.airport);
    }

    @Override
    public int hashCode() {
        return airport != null ? airport.hashCode() : 0;
    }
}
