package org.abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {

        testAbstractFactory();
    }

    private static void testAbstractFactory()
    {
        Computer computerPC = ComputerFactory.getComputer(new PCFactory("8", "500GB", "1"));
        Computer computerServer = ComputerFactory.getComputer(new ServerFactory("128", "10TB", "10"));

        System.out.println("AbstractFactory PC config " + computerPC);
        System.out.println("AbstractFactory Server config " + computerServer);
    }
}
