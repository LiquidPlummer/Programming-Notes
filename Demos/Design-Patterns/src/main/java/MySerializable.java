import java.io.Serializable;
import java.util.List;
//I'm going to magically transform this pojo into a "Java bean" simply by adding the
//Serializable marker interface (not a modern mechanism) - A java bean is a Serializable marked POJO
public class MySerializable implements Serializable {

    private String myString;
    private List<String> myStringList;
    private Integer myInteger;

    public MySerializable() {
    }

    public MySerializable(String myString, List<String> myStringList, Integer myInteger) {
        this.myString = myString;
        this.myStringList = myStringList;
        this.myInteger = myInteger;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public List<String> getMyStringList() {
        return myStringList;
    }

    public void setMyStringList(List<String> myStringList) {
        this.myStringList = myStringList;
    }

    public Integer getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(Integer myInteger) {
        this.myInteger = myInteger;
    }
}
