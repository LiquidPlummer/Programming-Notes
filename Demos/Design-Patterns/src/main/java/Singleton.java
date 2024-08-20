/*
A singleton is a thing that there will only be exactly one of - it only gets instantiated once
and every time you try to get another one you only get the one.

We will take control of instantiation so we can stop users from instantiating more than one
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        // singleton = singleton == null ? new Singleton() : singleton;//ooohh fancy!
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public void test() {
        System.out.println("test");
    }

}
