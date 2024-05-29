package linkedList;

import lombok.Data;

@Data
public class LinkedList {


    // length denotes the length of linkedList
    int length;

    // head node it points to the first node of linked list
    private Node head;

    // tail it points to the last node of the likedLit
    private Node tail;

    // it is constructor used for creating the linkedList which require a value to be passed which is assigned as a value of node
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // print the  nodes of linkedList
    public void print() {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            System.err.println(count + " node is " + temp.value);
            temp = temp.next;
            count++;
        }
    }

    // add new node at end of linkedList
    public void append(int value) {
        Node newNode = new Node(value);// create new node
        if (length == 0) { // if length of linkedList is 0 then the node is first node, so we can assign head and tail to same node
            head = newNode;
        } else { // we can assign tail.next (Which means tail points to the new node and the tail is shifted to new node)
            tail.next = newNode;
        }
        tail = newNode; // assign tail to new node
        length++; // incrementing the length of linkedList by 1
    }

    // add at node at the  starting of the likedList
    public void prepend(int value) {
        Node newNode = new Node(value);// create new node
        if (length == 0) {// is the length of the linkedList is 0 then new node is the first node assign head and tail to new node
            head = newNode;
            tail = newNode;
        } else {// if not then the new node points to the head node and head will point to the new node
            newNode.next = head;
            head = newNode;
        }
        length++;// increment length of linkedList by 1
    }

    // insert node at the middle of linked list

    /* To solve this we have to take two pointer one known as slow pointer and other is known as fast pointer well known as
       (Floyd’s slow and fast pointers). this help in finding the middle of the linkedList,
       after we can insert new node after this node which is new middle node of the linked list
    */

    public void insertAtMiddle(int value) {
        if (head == null) {
            // If the list is empty, insert the new node as the head
            head = new Node(value);
        } else {
            Node slowPointer = head;
            Node fastPointer = head;

            // Traverse the list to find the middle using slow and fast pointers
            while (fastPointer.next != null && fastPointer.next.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }

            // Insert the new node after the slow pointer
            Node newNode = new Node(value);
            newNode.next = slowPointer.next;
            slowPointer.next = newNode;
        }
        length++;
    }

    /*
    * Remove node form last of the LinkedList
            Steps to be followed to remove the element from the last
    * first traverse linkedList to the second last element
    * the assign tail to the  second last element and second last next to null
    * */

    public Node removeLast() {
        //if length of linkedList is 0 return null
        if (length == 0) return null;

        // take two pointer one take care for current element other take care of previous element
        Node current = head;
        Node prev = head;

        // iterate till the last of node of linkedList
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        // assign tail to previous node
        tail = prev;

        // pint previous  to null
        prev.next = null;

        // decrease the length by 1
        length--;

        // if length become 0 then point head and tail to null
        if (length == 0) {
            head = null;
            tail = null;
        }
        // return current element
        return current;
    }
}
