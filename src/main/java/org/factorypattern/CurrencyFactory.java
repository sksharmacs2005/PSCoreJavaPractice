package org.factorypattern;

import org.factory1.PC;
import org.factory1.Server;

public class CurrencyFactory {
    public static Currency getCurrency(String country) {
        return switch (country.toUpperCase()) {
            case "INDIA" -> new IndiaCurrency();
            case "USA" -> new USCurrency();
            case "BANGLADESH" -> new BangleDeshCurrency();
            default -> throw new IllegalArgumentException("No such currency is found! " + country);
        };
    }
    public static Currency getCurrency1(String country) {

        if (country.equalsIgnoreCase("India")) {
            return new IndiaCurrency();
        } else if (country.equalsIgnoreCase("USA")) {
            return new USCurrency();

        } else if (country.equalsIgnoreCase("BANGLADESH")) {
            return new BangleDeshCurrency();

        }

        return null;
    }
}
