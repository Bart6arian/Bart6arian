package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();
    private final String continentName;
    private final int countriesNumber;

    public Continent(Country country, String continentName, int countiesNumber) {
        this.continentName = continentName;
        this.countriesNumber = countiesNumber;

        countries.add(new Country("Vietnam", "Hanoi", 331212, 93643000, "Vietnamese"));
        countries.add(new Country("Cambodia", "Phnom Penh", 181035, 15288489, "Khmer"));
        countries.add(new Country("Indonesia", "Jakarta", 1904569, 267670543, "Indonesian"));
        countries.add(new Country("Kyrgyzstan", "Bishkek", 199951, 6586600, "Kyrgyz"));
        countries.add(new Country("Venezuela", "Caracas", 916445, 31431000, "Spanish"));
        countries.add(new Country("Cuba", "Havana", 110860, 11032343, "Spanish"));
        countries.add(new Country("Panama", "Panama", 75420, 3928646, "Spanish"));
        countries.add(new Country("Belize", "Belmopan", 22966, 386000, "English"));
        countries.add(new Country("Costa Rica", "San Jose", 51100, 4968000, "Spanish"));
        countries.add(new Country("Spain", "Madrid", 505990, 47450795, "Spanish"));
        countries.add(new Country("Finland", "Helsinki", 338455, 5536146, "Finnish"));
        countries.add(new Country("Serbia", "Beograd", 88362, 7111024, "Serbian"));
        countries.add(new Country("Ukraine", "Kyiv", 603628, 41383182, "Ukrainian"));
        countries.add(new Country("null", "null", 14200000, 2200, "null"));

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
