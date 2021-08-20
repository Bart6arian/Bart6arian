package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public World() {

    }

    public Continent addContinent(Continent continent) {
        return continent;
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
