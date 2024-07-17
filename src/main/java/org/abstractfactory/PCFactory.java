package org.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

/*    public PCFactory(String ram,String hdd,String cpu)
    {
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;

    }*/
    @Override
    public Computer craeteComputer() {
        return new PC(ram,hdd,cpu);
    }
}
