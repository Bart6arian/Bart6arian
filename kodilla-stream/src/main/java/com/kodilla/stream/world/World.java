package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public World() {

    }

    public void addContinent(Continent continent) {
            continents.add(continent);
    }

    public Set<Continent> getContinents() {
        return new HashSet<>(continents);
    }

    public BigDecimal countPeople() {
        BigDecimal countAllPeople = continents.stream()
                .flatMap(countries -> countries.getCountries().stream())
                .map(Country::getInhabitantsQuantity)
                .reduce(BigDecimal.ZERO, (sum, actual) -> sum = sum.add(actual));

        return countAllPeople;
    }

}
