package org.desgnpattern.factorypattern;

public class Factory {
    public static void main(String[] args) {
        String country=args[0];
        Currency currency = CurrencyFactory.createCurrency(country);
        System.out.println(currency.getSymbol());
    }
}
