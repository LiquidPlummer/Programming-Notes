package demo;

import org.w3c.dom.ls.LSOutput;

/*
Java Programming
Types, primitives, wrappers
Methods
Strings & String pool
Object Instantiation
Flow Control
 */
public class Main {
    {
        System.out.println("This isn't the actual beginning");
    }

    //The primitives -
    byte b = 12;//integer type
    int i = 6;//integer type
    short s;//integer type
    long l = 2;//integer type
    float f = 5.5f;//floating point number
    double d = 5.5;//floating point number
    boolean bool = false;//true or false
    char c = 'c';//these are actually ints, encoded as UTF-8, ASCII

    //primitive array
    int[] array = new int[2];//arrays are immutable in length

    //Wrappers
    Byte myByte = 5;
    Integer myInt = 6;
    Short myShort;
    Long myLong = 6l;
    Float myFloat = 5.5f;
    Double myDouble = 5.5;
    Boolean myBool = true;
    Character myChar = 'd';
    //these get autoboxed, they automatically get boxed and unboxed
    //it's a language-level sugar syntax
    //Integer myInteger2 = new Integer(4);

    String str = "Hello, World";
    String str2 = new String("Hello, World");//this doesn't go into the string pool
    //strings are immutable


    //Everything else are classes/objects, all objects are from classes

    //Object is the ur-parent, all classes are Objects because all classes derive from Object,
    //everything either explicitly "extends" (inherits) from something else, or implicitly
    //from Object
    Object obj = new Object();//standard instantiation
    //Type identifierName = new Type(/*Maybe parameters here*/);


    MyClass myClass = new MyClass(6);
    //now let's create a second reference
    MyClass myClass2 = myClass;
    MyClass myClass3 = myClass.getMyRef();




    public static void main(String[] args) {
        System.out.println("This is the PEP");
        Main main = new Main();//this is where the above code is executed
        System.out.println(main.i);
        System.out.println(main.myClass);
        System.out.println(main.myClass2);
        System.out.println(main.myClass3);

        MyEncapsulation myEncapsulation = new MyEncapsulation(1);
        System.out.println(myEncapsulation.getI());


    }


}
