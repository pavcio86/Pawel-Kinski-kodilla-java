package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String countryName;
    private final BigDecimal people;

    public Country(String countryName, BigDecimal people) {
        this.countryName = countryName;
        this.people = people;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQantity() {
        return people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }
}
