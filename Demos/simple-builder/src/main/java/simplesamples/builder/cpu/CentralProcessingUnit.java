package simplesamples.builder.cpu;

public abstract class CentralProcessingUnit {
    private int hertz;

    public CentralProcessingUnit(int hertz) {
        this.hertz = hertz;
    }

    public int getHertz() {
        return hertz;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;
    }
}
