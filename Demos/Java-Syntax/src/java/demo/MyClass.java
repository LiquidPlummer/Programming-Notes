package demo;

public class MyClass {
    private int i;//class scope
    //method signature for special method: the constructor
    //we leave the return type out, it's always a reference to this type of object
    public MyClass(int i) {
        this.i = i;
    }

    //non-constructor signatures
    //return types are required for all methods besides the constructor
    public void methodName(){
        //These things are all the signature:
        //public - access modifier
        //void - return type
        //methodName - identifier
        //() parameter list

        //After that came the block that we are in, this is not part of the sig,
        //this is the method body, or the implementation, or the concretion
    }

    //Methods always have a return type, so methods "resolve" to that return type
    public MyClass getMyRef() {
        return this;
    }
}
