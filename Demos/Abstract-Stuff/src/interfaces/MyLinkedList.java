package interfaces;

public class MyLinkedList<T> implements MyList<T>{
    int length;
    Node<T> head;

    public MyLinkedList() {
        this.length = 0;
    }


    public void add(T t) {
        if(this.length == 0) {
            head = new Node<T>(t);
        } else {
            //need to traverse to TAIL and then add this as the new tail
        }
        this.length++;
    }

    public void add(T t, int index) {

    }

    public void remove(int index) {

    }

    public void remove(T t) {

    }

    public T get(int index) {
        return null;
    }
}

class Node<T> {
    public T t;
    public Node<T> next;

    public Node() {

    }

    public Node(T t) {
        this.t = t;
    }

    public Node(T t, Node<T> next) {
        this.t = t;
        this.next = next;
    }
}