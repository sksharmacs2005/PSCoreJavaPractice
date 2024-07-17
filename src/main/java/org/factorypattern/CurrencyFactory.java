package org.factorypattern;

public class CurrencyFactory {
    public static Currency getCurrency(String country)
    {
       return switch(country.toUpperCase())
        {
            case "INDIA" -> new IndiaCurrency();
            case "USA" -> new USCurrency();
            case "BANGLADESH" -> new BangleDeshCurrency();
            default -> throw new IllegalArgumentException("No such currency is found! " + country);
        };
    }
}
