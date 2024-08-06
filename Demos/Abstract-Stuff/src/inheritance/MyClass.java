package inheritance;

import interfaces.MyList;

public class MyClass {
    public MyList<Object> myList;

    public void doSomething(){
        myList.add(new Object());
    }
}
