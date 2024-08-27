package simplesamples.builder.computer;

import simplesamples.builder.Builder;
import simplesamples.builder.cpu.CentralProcessingUnit;
import simplesamples.builder.console.Console;
import simplesamples.builder.ram.RandomAccessMemory;

/**
 *
 */
public class Computer {

    /**
     *
     */
    private final CentralProcessingUnit cpu;
    private final RandomAccessMemory ram;
    private final Console console;

    /**
     *
     * @param builder
     */
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.console = builder.console;
    }

    /**
     *
     */
    public void run() {
        this.console.run(this);
    }

    public CentralProcessingUnit getCpu() {
        return cpu;
    }

    public RandomAccessMemory getRam() {
        return ram;
    }

    public Console getConsole() {
        return console;
    }

    /**
     * The ComputerBuilder, builds Computers.
     */
    public static class ComputerBuilder implements Builder<Computer> {

        //
        private CentralProcessingUnit cpu;
        private RandomAccessMemory ram;
        private Console console;

        public ComputerBuilder() {
            //
        }

        public ComputerBuilder installCpu(CentralProcessingUnit cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder installRam(RandomAccessMemory ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder installConsole(Console console) {
            this.console = console;
            return this;
        }

        public boolean isValid() {
            return cpu != null && ram != null && console != null;
        }

        public Computer build() throws ComputerWontBootException {
            if(isValid()) {
                return new Computer(this);
            }
            throw new ComputerWontBootException("This computer won't boot!");

        }
    }
}
