package simplesamples;

import simplesamples.builder.computer.Computer;
import simplesamples.builder.computer.ComputerWontBootException;
import simplesamples.builder.console.KpConsole;
import simplesamples.builder.cpu.X86;
import simplesamples.builder.ram.Dimm;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws ComputerWontBootException {
        Computer myComputer = new Computer.ComputerBuilder()
                .installConsole(new KpConsole())
                .installCpu(new X86(4096))
                .installRam(new Dimm(1024, 333))
                .build();



        myComputer.run();
    }
}
