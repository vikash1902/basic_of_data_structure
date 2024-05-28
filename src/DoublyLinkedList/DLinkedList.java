package DoublyLinkedList;

import lombok.Data;

@Data
public class DLinkedList {


    private int length;

    private DoublyLinkedList.Node head;

    private DoublyLinkedList.Node tail;

    public DLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void  print(){
        DoublyLinkedList.Node temp = head;
        while(temp != null){
            System.err.println(temp.value);
            temp = temp.next;
        }
    }

}
