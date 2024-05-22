package org.desgnpattern.factorypattern;

public class CurrencyFactory {
    public static Currency createCurrency(String country)
    {
        if(country.equalsIgnoreCase("India")) {
            return new Rupee();
        }
         else if(country.equalsIgnoreCase("USA")) {
            return new USDoller();
        }
           else if(country.equalsIgnoreCase("Singapure")) {
            return new SGDSingapure();
        }
           throw new IllegalArgumentException("No such Currency!!");

        }

}
