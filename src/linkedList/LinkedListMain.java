package linkedList;

public class LinkedListMain {

    public static void main(String[] args){
        LinkedList newLinkedList = new LinkedList(1);

        System.err.println("head " + newLinkedList.getHead().value);

        System.err.println("tail " + newLinkedList.getTail().value);

        System.err.println("length " + newLinkedList.getLength());

        newLinkedList.print();
    }
}
