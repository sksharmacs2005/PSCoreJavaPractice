package org.abstpattern;

public class EUROFactory implements CountryFactory{
    @Override
    public Currency craeteCurrency() {
        return new EUROCurrency();
    }

    @Override
    public Country createCountry() {
        return new EURCountry();
    }
}
