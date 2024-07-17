package org.factory1;

public class MainComputerFactory {
    public static void main(String[] args) {
        Computer computerPC = ComputerFactory.getComputer("pc","2", "200", "1");
        Computer computerServer = ComputerFactory.getComputer("server", "10", "10TB", "5");

        System.out.println("Factory PC config = " + computerPC);
        System.out.println("Factory Server config = " + computerServer);

    }
}
