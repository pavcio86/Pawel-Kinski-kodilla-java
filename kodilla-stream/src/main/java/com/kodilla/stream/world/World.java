package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final String name;

    public World(String name) {
        this.name = name;
    }

    private final List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList() {
        return continentList;
    }

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public void removeContinent(Continent continent){
        continentList.remove(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
