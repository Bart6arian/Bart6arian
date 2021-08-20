package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country implements Inhabitants {
    private final String countryName;
    private final String capital;
    private final double area;
    private final int people;
    private final String language;

    public Country(String countryName, String capital, double area, int people, String language) {
        this.countryName = countryName;
        this.capital = capital;
        this.area = area;
        this.people = people;
        this.language = language;
    }

    public String getCountryName() {
        return countryName;
    }


    public String getCapitol() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public int getPeople() {
        return people;
    }

    public String getLanguage() {
        return language;
    }

    public double manPerKmSquare() {
        return (people/area);
    }

    public boolean accessToCoastLine(int isOrNot) {
        boolean result = false;
        if(isOrNot == 1) {
            System.out.println(countryName+" has access to coastline.");
            result = true;
        } else {
            if(isOrNot == 2) {
                System.out.println(countryName + " is island.");
                result = true;
            }
        }
        return result;
    }

    @Override
    public BigDecimal getInhabitantsQuantity() {
        BigDecimal peopleInCountry = new BigDecimal(getPeople());
        return peopleInCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (Double.compare(country.getArea(), getArea()) != 0) return false;
        if (getPeople() != country.getPeople()) return false;
        if (getCountryName() != null ? !getCountryName().equals(country.getCountryName()) : country.getCountryName() != null)
            return false;
        if (!Objects.equals(capital, country.capital)) return false;
        return getLanguage() != null ? getLanguage().equals(country.getLanguage()) : country.getLanguage() == null;
    }

    @Override
    public String toString() {
        return "Country: " +
                ", Name: " + countryName + '\'' +
                ", Capital: " + capital + '\'' +
                ", Land area: " + area +
                ", Inhabitants: " + people +
                ", National language: " + language + '\'' +
                ".";
    }
}
