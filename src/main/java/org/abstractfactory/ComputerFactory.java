package org.abstractfactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory abstractFactor)
    {
        return abstractFactor.craeteComputer();
    }
}
