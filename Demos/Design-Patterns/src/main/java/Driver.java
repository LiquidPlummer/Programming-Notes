public class Driver {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        //two equivalent pojos:
        MyPojo p1 = new MyPojo();
        p1.setMyPrivateString("Hello");

        MyPojo p2 = new MyPojo();
        p2.setMyPrivateString("Hello");


        if(p1.equals(p2)) {
            System.out.println("they're the same! ");
        }

        System.out.println(p1 + "|" + p2);


    }
}
