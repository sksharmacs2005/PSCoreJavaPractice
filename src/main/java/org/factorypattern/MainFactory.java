package org.factorypattern;

public class MainFactory {
    public static void main(String[] args) {
        Currency india = CurrencyFactory.getCurrency("India");
        System.out.println("India Currency = " + india.getSymbol());
    }
}
