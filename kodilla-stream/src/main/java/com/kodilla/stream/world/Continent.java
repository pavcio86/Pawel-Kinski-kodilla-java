package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;

    private  final List<Country> countriesList = new ArrayList<>();

    public void addCountry(Country country){
        countriesList.add(country);
    }

    public boolean removeCountry(Country country){
        return  countriesList.remove(country);
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countriesList;
    }
}
