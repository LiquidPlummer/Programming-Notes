package interfaces;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private final int MIN_SIZE = 4;


    private int length;//how many contiguous elements are currently in the array
    private int maxLength; //how big is the array, afterwords we need to grow

    private Object[] array;

    public MyArrayList(int length) {
        this.array = new Object[length];
        this.length = 0;
    }

    public MyArrayList() {
        array = new Object[MIN_SIZE];
    }

    public void add(T t) {
        //length++;
    }

    public void add(T t, int index) {
        array[index] = t;
    }

    public void remove(int index) {

    }

    public void remove(T t) {

    }

    public T get(int index) {
        return (T)array[index];
    }

    private void grow() {
        //grow the array
        //create a newer bigger array, and copy the old one into it
    }


    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int iter = 0;

            @Override
            public boolean hasNext() {
                return iter < length;
            }

            @Override
            public T next() {
                return (T)array[iter];
            }
        };
    }

}