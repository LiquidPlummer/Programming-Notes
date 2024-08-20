import java.util.Objects;

public class MyPojo {
    //A plain old java object is the simplest encapsulation in java
    //encapsulation: logical bundle of data and behaviors into a unit we call the class, also the internal state is
    // only accessed via the behaviors

    //some number of private "member variables" - "fields"
    //the state is private
    private String myPrivateString;

    //some number of public "member functions" - "methods"
    //the methods are public and offer a way to interact with the encapsulation
    //these are "getters" and "setters" in java, in other languages commonly called "mutators"

    public String getMyPrivateString() {
        return myPrivateString;
    }

    public void setMyPrivateString(String myPrivateString) {
        this.myPrivateString = myPrivateString;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPojo myPojo = (MyPojo) o;
        return Objects.equals(myPrivateString, myPojo.myPrivateString);
    }




}
