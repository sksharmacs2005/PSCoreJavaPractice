package org.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

 /*   public ServerFactory(String ram,String hdd,String cpu)
    {
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;

    }*/
    @Override
    public Computer craeteComputer() {
        return new Server(ram,hdd,cpu);
    }
}
