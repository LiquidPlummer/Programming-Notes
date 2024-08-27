package simplesamples.builder.ram;

public class Dimm extends RandomAccessMemory{

    public Dimm(int capacity, int clockSpeed) {
        super(capacity, clockSpeed);
    }

    @Override
    public String toString() {
        return getCapacity() + " bytes @" + getClockSpeed();
    }
}
