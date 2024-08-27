package simplesamples.builder.console;

import simplesamples.builder.computer.Computer;

public class KpConsole implements Console {
    @Override
    public void run(Computer computer) {
        System.out.print("====================================\n" +
                "========== " + computer.getConsole() + " ==========\n" +
                "CPU: " + computer.getCpu() + "\n" +
                "RAM: " + computer.getRam() + "\n" +
                "====================================\n");
    }

    @Override
    public String toString() {
        return "KpCon Ver 0.1a";
    }
}
