package org.abstpattern;

public class IndiaFactory implements CountryFactory{
    @Override
    public Currency craeteCurrency() {
        return new INRCurrency();
    }

    @Override
    public Country createCountry() {
        return new INDCountry();
    }
}
