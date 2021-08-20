package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();
    private final String continentName;
    private final int countriesNumber;

    public Continent(String continentName, int countriesNumber) {
        this.continentName = continentName;
        this.countriesNumber = countriesNumber;
    }

    public Country addCountry(Country country) {
        return country;
    }

    public String getContinentName() {
        return continentName;
    }

    public int getCountiesNumber() {
        return countriesNumber;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent: " + continentName +'\n'+
                "Countries: " + countries + '\'' +
                "Countries number: " + countriesNumber +
                ".";
    }
}
