package adt;
public class Node {
    Node head;
    public String data; //data variable to store candidate names
    private Node next; //next variable to store next node address
    Node(String data){ /***
     * a constructor to initialize the data and next
     ***/
        this.data=data;
        setNext(null);
    }
    public Node getNext() {
        return next;
    }
    //a getter for next variable
    public void setNext(Node next) {
        //a setter for next variable
        this.next = next;
    }
}
