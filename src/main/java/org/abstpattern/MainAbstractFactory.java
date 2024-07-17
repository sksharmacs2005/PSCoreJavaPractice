package org.abstpattern;

public class MainAbstractFactory {
    public static void main(String[] args) {

        CountryFactory indFactory=new IndiaFactory();

        System.out.println("India Currency = " + indFactory.craeteCurrency().getSymbol());
        System.out.println("Country Name = " + indFactory.createCountry().getName());

        CountryFactory usFactory=new USFactory();

        System.out.println("US Currency = " + usFactory.craeteCurrency().getSymbol());
        System.out.println("Country Name = " + usFactory.createCountry().getName());

        CountryFactory eruoFactory=new EUROFactory();

        System.out.println("Europe Currency = " + eruoFactory.craeteCurrency().getSymbol());
        System.out.println("Country Name = " + eruoFactory.createCountry().getName());
    }
}
