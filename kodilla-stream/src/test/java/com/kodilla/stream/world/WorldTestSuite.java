package com.kodilla.stream.world;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

@DisplayName
        ("Tests for World exercise")

public class WorldTestSuite {
    private static World world;
    private Continent continent;
    private Country country;
    private static int testsToDo =1;
    private final Set<Country> countries = new HashSet<>();
    private final Set<Continent> continents = new HashSet<>();


    @BeforeEach
    void bfEach() {
        testsToDo--;
        System.out.println("Tests left: "+testsToDo);
    }
    @AfterAll
    static void afAll() {
        System.out.println("All test passed. Tests done: "+testsToDo);
    }

    @Test
    void testGetPeopleQuantity() {
        world.addContinent(new Continent("Asia", 48));
        world.addContinent(new Continent("Europe", 44));
        world.addContinent(new Continent("South America", 12));
        world.addContinent(new Continent("Antarctica", 0));
        continent.addCountry(new Country("Vietnam", "Hanoi", 331212, 93643000, "Vietnamese"));
        continent.addCountry(new Country("Cambodia", "Phnom Penh", 181035, 15288489, "Khmer"));
        continent.addCountry(new Country("Indonesia", "Jakarta", 1904569, 267670543, "Indonesian"));
        continent.addCountry(new Country("Kyrgyzstan", "Bishkek", 199951, 6586600, "Kyrgyz"));
        continent.addCountry(new Country("Venezuela", "Caracas", 916445, 31431000, "Spanish"));
        continent.addCountry(new Country("Cuba", "Havana", 110860, 11032343, "Spanish"));
        continent.addCountry(new Country("Panama", "Panama", 75420, 3928646, "Spanish"));
        continent.addCountry(new Country("Belize", "Belmopan", 22966, 386000, "English"));
        continent.addCountry(new Country("Costa Rica", "San Jose", 51100, 4968000, "Spanish"));
        continent.addCountry(new Country("Spain", "Madrid", 505990, 47450795, "Spanish"));
        continent.addCountry(new Country("Finland", "Helsinki", 338455, 5536146, "Finnish"));
        continent.addCountry(new Country("Serbia", "Beograd", 88362, 7111024, "Serbian"));
        continent.addCountry(new Country("Ukraine", "Kyiv", 603628, 41383182, "Ukrainian"));
        continent.addCountry(new Country("null", "null", 14200000, 2200, "null"));

        //when
        BigDecimal allPeople = continents.stream()
                .flatMap(countries -> countries.getCountries().stream())
                .map(Country::getInhabitantsQuantity)
                .reduce(BigDecimal.ZERO, (sum, actual) -> sum = sum.add(actual));
        //then
        BigDecimal expected = new BigDecimal("7509851552");
        assertEquals(expected , allPeople);
    }

}
