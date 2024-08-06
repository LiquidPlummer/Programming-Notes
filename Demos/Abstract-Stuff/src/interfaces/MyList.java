package interfaces;
//definition of abstraction: hide complex implementation details and expose PUBLIC interface
public interface MyList<T> {
    void add(T t);
    void add(T t, int index);
    void remove(int index);
    void remove(T t);
    T get(int index);

}
