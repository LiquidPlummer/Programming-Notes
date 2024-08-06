package interfaces;

import inheritance.MyClass;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myIntegerList = new MyArrayList<>();
        myIntegerList.add(6);
        System.out.println(myIntegerList.get(0));

    }
}
