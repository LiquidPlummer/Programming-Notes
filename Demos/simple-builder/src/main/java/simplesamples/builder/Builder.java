package simplesamples.builder;

import simplesamples.builder.computer.ComputerWontBootException;

public interface Builder<T> {
    T build() throws ComputerWontBootException;
}
