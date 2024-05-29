package linkedList;

public class LinkedListMain {

    public static void main(String[] args){

        // creation of linkedList with node having value 1
        LinkedList newLinkedList = new LinkedList(1);
        System.err.println("head " + newLinkedList.getHead().value);
        System.err.println("tail " + newLinkedList.getTail().value);
        System.err.println("length " + newLinkedList.getLength());
        newLinkedList.print();


        // appending new node to existing linkedList (adding node at end of linkedList)
        newLinkedList.append(2);
        newLinkedList.print();
        System.err.println("length " + newLinkedList.getLength());

        // prepend new node (adding node at the start of linkedList
        newLinkedList.prepend(0);
        newLinkedList.print();
        System.err.println("head " + newLinkedList.getHead().value);
        System.err.println("tail " + newLinkedList.getTail().value);
        System.err.println("length " + newLinkedList.getLength());

        // insert any node at the middle of the linked list
        System.err.println("add node at middle of linked list");
        newLinkedList.insertAtMiddle(5);
        newLinkedList.print();

        // remove node from last in linked list
        System.err.println("remove element from last ");
        newLinkedList.append(3);
        newLinkedList.append(4);
        System.err.println(newLinkedList.removeLast().value);
        System.err.println(newLinkedList.removeLast().value);
        System.err.println(newLinkedList.removeLast().value);
        System.err.println(newLinkedList.removeLast());
        newLinkedList.print();

        // remove node from start of the linkedList
    }
}
