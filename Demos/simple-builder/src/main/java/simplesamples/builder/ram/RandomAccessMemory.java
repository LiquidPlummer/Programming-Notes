package simplesamples.builder.ram;

public abstract class RandomAccessMemory {
    private int capacity;
    private int clockSpeed;

    public RandomAccessMemory(int capacity, int clockSpeed) {
        this.capacity = capacity;
        this.clockSpeed = clockSpeed;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
