package linkedList;

public class LinkedListMain {

    public static void main(String[] args){
        LinkedList newLinkedList = new LinkedList(1);

        System.err.println("head " + newLinkedList.getHead().value);

        System.err.println("tail " + newLinkedList.getTail().value);

        System.err.println("length " + newLinkedList.getLength());

        newLinkedList.print();

        System.err.println("------------------------");
        // append new node

        newLinkedList.append(2);

        newLinkedList.print();

        System.err.println("length " + newLinkedList.getLength());

        System.err.println("------------------------");
        // prepend new node

        newLinkedList.append(3);

        newLinkedList.prepend(0);

        newLinkedList.print();

        System.err.println("head " + newLinkedList.getHead().value);

        System.err.println("tail " + newLinkedList.getTail().value);

        System.err.println("length " + newLinkedList.getLength());

        System.err.println("------------------------");
    }
}
