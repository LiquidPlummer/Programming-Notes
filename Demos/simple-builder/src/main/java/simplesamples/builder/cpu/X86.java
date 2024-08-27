package simplesamples.builder.cpu;

public class X86 extends CentralProcessingUnit {

    public X86(int hertz) {
        super(hertz);
    }

    @Override
    public String toString() {
        return getHertz() + " Hz x86 cpu";
    }
}
