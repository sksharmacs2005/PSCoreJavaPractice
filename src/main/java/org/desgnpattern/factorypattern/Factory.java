package org.desgnpattern.factorypattern;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String countyry = scanner.nextLine();
        //String country=args[0];
        Currency currency = CurrencyFactory.createCurrency(countyry);
        System.out.println(currency.getSymbol());
    }
}
