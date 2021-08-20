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
    private World world = new World();
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
        Continent asia = new Continent("Asia", 48);
        Continent europe = new Continent("Europe", 44);
        Continent southAmerica = new Continent("South America", 12);
        Continent antarctica = new Continent("Antarctica", 0);
        //asian countries
        Country vietnam = new Country("Vietnam", "Hanoi", 331212, 93643000, "Vietnamese");
        Country cambodia = new Country("Cambodia", "Phnom Penh", 181035, 15288489, "Khmer");
        Country indonesia = new Country("Indonesia", "Jakarta", 1904569, 267670543, "Indonesian");
        Country kyrgyzstan = new Country("Kyrgyzstan", "Bishkek", 199951, 6586600, "Kyrgyz");
        //south american countries
        Country venezuela = new Country("Venezuela", "Caracas", 916445, 31431000, "Spanish");
        Country cuba = new Country("Cuba", "Havana", 110860, 11032343, "Spanish");
        Country panama = new Country("Panama", "Panama", 75420, 3928646, "Spanish");
        Country belize = new Country("Belize", "Belmopan", 22966, 386000, "English");
        Country costaRica = new Country("Costa Rica", "San Jose", 51100, 4968000, "Spanish");
        // european countries
        Country spain = new Country("Spain", "Madrid", 505990, 47450795, "Spanish");
        Country finland = new Country("Finland", "Helsinki", 338455, 5536146, "Finnish");
        Country serbia = new Country("Serbia", "Beograd", 88362, 7111024, "Serbian");
        Country ukraine = new Country("Ukraine", "Kyiv", 603628, 41383182, "Ukrainian");
        //antarctic countries
        Country nullCountry = new Country("null", "null", 14200000, 2200, "null");
        // for asia
        asia.addCountry(cambodia);
        asia.addCountry(vietnam);
        asia.addCountry(indonesia);
        asia.addCountry(kyrgyzstan);
        // for south america
        southAmerica.addCountry(venezuela);
        southAmerica.addCountry(cuba);
        southAmerica.addCountry(costaRica);
        southAmerica.addCountry(panama);
        southAmerica.addCountry(belize);
        //for europe
        europe.addCountry(serbia);
        europe.addCountry(spain);
        europe.addCountry(ukraine);
        europe.addCountry(finland);
        //for antarctica
        antarctica.addCountry(nullCountry);

        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(europe);
        world.addContinent(antarctica);



        //when
        BigDecimal allPeople = world.getContinents().stream()
                .flatMap(countries -> countries.getCountries().stream())
                .map(Country::getInhabitantsQuantity)
                .reduce(BigDecimal.ZERO, (sum, actual) -> sum = sum.add(actual));
        //then
        BigDecimal expected = new BigDecimal("536417968");
        assertEquals(expected , allPeople);
    }

}
