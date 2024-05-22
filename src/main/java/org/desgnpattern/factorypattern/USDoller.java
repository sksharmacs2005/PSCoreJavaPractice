package org.desgnpattern.factorypattern;

public class USDoller implements Currency {
    @Override
    public String getSymbol() {
        return "$USD";
    }
}
