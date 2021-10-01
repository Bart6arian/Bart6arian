package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.Objects;

public class Arrival {
    private String airport;

    public Arrival(String airport) {
        this.airport = airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arrival)) return false;

        Arrival arrival = (Arrival) o;

        return Objects.equals(airport, arrival.airport);
    }

    @Override
    public int hashCode() {
        return airport != null ? airport.hashCode() : 0;
    }
}
