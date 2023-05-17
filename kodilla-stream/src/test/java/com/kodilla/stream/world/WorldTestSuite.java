package com.kodilla.stream.world;


import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("World Test Suite")
public class WorldTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterEach
    public void afterEvrytest(){
        System.out.println("Test #" + testCounter + " finished");
    }

    //Create world :)
    World earth = new World("Earth");


    @Test
    void testAddContinent(){
        //Given
        Continent eurasia = new Continent("Eurasia");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        //When
        earth.addContinent(eurasia);
        earth.addContinent(europe);
        earth.addContinent(asia);

        //Then
        assertEquals(3, earth.getContinentList().size());
        assertTrue(earth.getContinentList().contains(eurasia));
    }

    @Test
    void testRemoveContinent(){
        //Given
        Continent eurasia = new Continent("Eurasia");

        //When
        earth.addContinent(eurasia);
        earth.removeContinent(eurasia);

        //Then
        Assertions.assertFalse(earth.getContinentList().contains(eurasia));
        assertTrue(earth.getContinentList().isEmpty());
    }


    @DisplayName("when create a world with the continents and countries in them and using getPeopleQuantity() method, "
            + "then it should return total number of people on all continents in all countries"
    )
    @Test
    void testGetPeopleQuantity(){
        //Given

        //Create continents
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");
        Continent northAmerica = new Continent("North America");
        Continent antarctica = new Continent("Antarctica");
        Continent australia = new Continent("Australia");
        Continent asia = new Continent("Asia");

        //Create countries of Europe
        Country poland = new Country("Poland", new BigDecimal("37766327"));
        Country germany = new Country("Germany", new BigDecimal("85346203"));
        Country france = new Country("France", new BigDecimal("67904153"));
        Country spain = new Country("Spain", new BigDecimal("90453824"));
        Country italy = new Country("Italy", new BigDecimal("56308621"));

        //Create countries of Africa
        Country egypt = new Country("Egypt", new BigDecimal("86735175"));
        Country tanzania = new Country("Tanzania", new BigDecimal("85056547"));
        Country kenya = new Country("Kenya", new BigDecimal("20698745"));
        Country sudan = new Country("Sudan", new BigDecimal("30253824"));
        Country morocco = new Country("Morocco", new BigDecimal("56308123"));
        Country nigeria = new Country("Nigeria", new BigDecimal("7448621"));

        //Create countries of South America
        Country argentina = new Country("Argentina", new BigDecimal("34766327"));
        Country bolivia = new Country("Bolivia", new BigDecimal("85346203"));
        Country brazil = new Country("Brazil", new BigDecimal("679047153"));
        Country chile = new Country("Chile", new BigDecimal("90473824"));
        Country peru = new Country("Peru", new BigDecimal("56308471"));
        Country venezuela = new Country("Venezuela", new BigDecimal("547308621"));

        //Create countries of North America
        Country mexico = new Country("Mexico", new BigDecimal("360485147"));
        Country canada = new Country("Canada", new BigDecimal("853465853"));
        Country usa = new Country("U.S.A.", new BigDecimal("67584153"));
        Country cuba = new Country("Cuba", new BigDecimal("904539624"));
        Country guatemala = new Country("Guatemala", new BigDecimal("56323621"));

        //Create countries of Antarctica
        Country frozenAss = new Country("Frozen Ass", new BigDecimal("36766327"));
        Country icyBalls = new Country("Icy Balls", new BigDecimal("41346203"));
        Country snowyTits = new Country("Snowy Tits", new BigDecimal("67932153"));
        Country hotRefrigerator = new Country("Hot Refrigerator", new BigDecimal("90433824"));

        //Create countries of Australia
        Country austra1ia = new Country("Austra1ia", new BigDecimal("37626327"));
        Country papuaNewGuinea = new Country("Papua New Guinea", new BigDecimal("85876203"));
        Country newZealand = new Country("New Zealand", new BigDecimal("46904153"));
        Country fiji = new Country("Fiji", new BigDecimal("906953824"));

        //Create countries of Asia
        Country russia = new Country("Russia", new BigDecimal("150789425"));
        Country china = new Country("China", new BigDecimal("1425789456"));
        Country india = new Country("India", new BigDecimal("1457258652"));
        Country japan = new Country("Japan", new BigDecimal("53453824"));
        Country indonesia = new Country("Indonesia", new BigDecimal("84308621"));

        //When
        //filling continents with countries
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(spain);
        europe.addCountry(italy);
        africa.addCountry(egypt);
        africa.addCountry(tanzania);
        africa.addCountry(sudan);
        africa.addCountry(morocco);
        africa.addCountry(kenya);
        africa.addCountry(nigeria);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(bolivia);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(peru);
        southAmerica.addCountry(venezuela);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(cuba);
        northAmerica.addCountry(guatemala);
        antarctica.addCountry(frozenAss);
        antarctica.addCountry(icyBalls);
        antarctica.addCountry(snowyTits);
        antarctica.addCountry(hotRefrigerator);
        australia.addCountry(austra1ia);
        australia.addCountry(papuaNewGuinea);
        australia.addCountry(newZealand);
        australia.addCountry(fiji);
        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(indonesia);

        //filling world with continents
        earth.addContinent(asia);
        earth.addContinent(africa);
        earth.addContinent(australia);
        earth.addContinent(antarctica);
        earth.addContinent(southAmerica);
        earth.addContinent(northAmerica);
        earth.addContinent(europe);

        BigDecimal peopleQuantity = new BigDecimal("8845368152");

        //Then
        assertEquals(peopleQuantity, earth.getPeopleQuantity());
    }
}
