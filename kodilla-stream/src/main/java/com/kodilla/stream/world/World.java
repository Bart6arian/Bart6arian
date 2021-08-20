package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public World() {
        continents.add(new Continent(new Country("Vietnam", "Hanoi", 331212, 93643000, "Vietnamese"),"Asia", 48));
        continents.add(new Continent(new Country("Cambodia", "Phnom Penh", 181035, 15288489, "Khmer"),"Asia", 48));
        continents.add(new Continent(new Country("Indonesia", "Jakarta", 1904569, 267670543, "Indonesian"),"Asia", 48));
        continents.add(new Continent(new Country("Kyrgyzstan", "Bishkek", 199951, 6586600, "Kyrgyz"),"Asia", 48));
        continents.add(new Continent(new Country("Venezuela", "Caracas", 916445, 31431000, "Spanish"), "South America", 12));
        continents.add(new Continent(new Country("Cuba", "Havana", 110860, 11032343, "Spanish"), "South America", 12));
        continents.add(new Continent(new Country("Panama", "Panama", 75420, 3928646, "Spanish"), "South America", 12));
        continents.add(new Continent(new Country("Belize", "Belmopan", 22966, 386000, "English"), "South America", 12));
        continents.add(new Continent(new Country("Costa Rica", "San Jose", 51100, 4968000, "Spanish"), "South America", 12));
        continents.add(new Continent(new Country("Spain", "Madrid", 505990, 47450795, "Spanish"),"Europe", 44));
        continents.add(new Continent(new Country("Finland", "Helsinki", 338455, 5536146, "Finnish"),"Europe", 44));
        continents.add(new Continent(new Country("Serbia", "Beograd", 88362, 7111024, "Serbian"),"Europe", 44));
        continents.add(new Continent(new Country("Ukraine", "Kyiv", 603628, 41383182, "Ukrainian"),"Europe", 44));
        continents.add(new Continent(new Country("null", "null", 14200000, 2200, "null"),"Antarctica", 0));
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
