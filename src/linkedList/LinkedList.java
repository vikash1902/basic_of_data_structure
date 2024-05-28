package linkedList;

import lombok.Data;
import lombok.Getter;

@Data
public class LinkedList {

    Node head;

    Node tail;

    int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.err.println("the node is " + temp.value);
            temp = temp.next;
        }
    }

    // add new node at last
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}
