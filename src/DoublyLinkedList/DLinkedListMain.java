package DoublyLinkedList;

public class DLinkedListMain {


    public static void main(String[] args){
        DLinkedList doublyLinkedList = new DLinkedList(5);

        System.err.println("head " + doublyLinkedList.getHead().value);
        System.err.println("tail " + doublyLinkedList.getTail().value);
        System.err.println("length " + doublyLinkedList.getLength());
        doublyLinkedList.print();
    }



}
