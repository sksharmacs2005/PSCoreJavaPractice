package org.abstpattern;

public class USFactory implements CountryFactory{
    @Override
    public Currency craeteCurrency() {
        return new USCurrency();
    }

    @Override
    public Country createCountry() {
        return new USCountry();
    }
}
