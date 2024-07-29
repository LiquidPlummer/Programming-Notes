package demo;

/*
Inheritance - receive data and behaviors from another class
Encapsulation - the logical bundling of data behaviors, the state should not be accessed except via the behaviors
Abstraction - exposing only a simplified interface, hiding complex implementation details
Polymorphism - a set of concepts which emerge from I, E, A above
 */

/*
Single-responsibility principle: "There should never be more than one reason for a class to change."[2] In other words, every class should have only one responsibility.[3]
Open–closed principle: "Software entities ... should be open for extension, but closed for modification."[4]
Liskov substitution principle: "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."[5] See also design by contract.[5]
Interface segregation principle: "Clients should not be forced to depend upon interfaces that they do not use."[6][7]
Dependency inversion principle: "Depend upon abstractions, [not] concretes."[8][7]
 */

//DRY - Don't repeat yourself

//Dependency Injection -
// loose coupling - doesn't suffer from refactor cascade

import java.util.LinkedList;
import java.util.List;

public class HelloWorld{
   public static void main(String[] args) {
      //Next episode:
      // Types, primitives, wrappers, Flow Control,
      // strings, string pool, object instantiation

      List<Integer> myList = new LinkedList<>();

      System.out.println("Hello, World");

      String myString = "Hello";
      myString.length();


      for(int i = 0; i < args.length; i++) {
         System.out.println(args[i]);
      }

      //This is called try-with-resources
      //resources should be destroyed gracefully
      try/*(MyClass myClass = new Connection())*/{
      } catch(Exception e){
          System.out.println(e);
      }

   }
}