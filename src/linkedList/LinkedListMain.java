package linkedList;

public class LinkedListMain {

    public static void main(String[] args){

        // creation of linkedList with node having value 1
        LinkedList newLinkedList = new LinkedList(1);

        // printing the head linkedList
        System.err.println("head " + newLinkedList.getHead().value);

        // printing the tail value  linkedList
        System.err.println("tail " + newLinkedList.getTail().value);

        // printing the length of linkedList
        System.err.println("length " + newLinkedList.getLength());

        // printing all nodes of linkedList
        newLinkedList.print();

        System.err.println("------------------------");

        // appending new node to existing linkedList (adding node at end of linkedList)
        newLinkedList.append(2);

        newLinkedList.print();

        System.err.println("length " + newLinkedList.getLength());

        System.err.println("------------------------");


        // prepend new node (adding node at the start of linkedList
        newLinkedList.prepend(0);

        newLinkedList.print();

        System.err.println("head " + newLinkedList.getHead().value);

        System.err.println("tail " + newLinkedList.getTail().value);

        System.err.println("length " + newLinkedList.getLength());

        System.err.println("------------------------");

        System.err.println("add node at middle of linked list");

        newLinkedList.insertAtMiddle(5);

        newLinkedList.insertAtMiddle(4);

        newLinkedList.insertAtMiddle(7);

        newLinkedList.insertAtMiddle(9);

        newLinkedList.print();
    }
}
