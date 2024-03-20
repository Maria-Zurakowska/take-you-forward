package com.takeyouforward.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    // This constructor allows me to set next = null once.
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

//    Node temp = head;
//
//        while(temp != null){ // traversing through a LinkedList
//        System.out.print(temp.getData() + " "); //-> Print the LL
//        temp = temp.getNext();
//    }

    public static Node convertArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]); // head of the LL
        Node mover = head; // mover stands in the first place

        for (int i = 1; i < arr.length; i++){ // iterating through array
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthOfALinkedList(Node head){
        int counter = 0;
        Node temp = head;

        while(temp != null){ // traversing through a LinkedList
            //System.out.print(temp.getData() + " "); -> Print the LL
            temp = temp.getNext();
            counter++;
        }
        return counter;
    }

    public static int checkIfPresentInLinkedList(Node head, int value){
        Node temp = head;

        while(temp != null){
            if (temp.getData() == value) return 1;
            temp = temp.getNext();
        }
        return 0;
    }

    public static Node removesHead(Node head){ // delete 1st element (HEAD) of LL
        if(head == null) return head; //edge case –> empty LL
        head = head.next;   // the second element becomes the head
        return head;        // garbage collector will remove first element when not used
    }

    public static Node removeTail(Node head){ // delete last element (TAIL) of LL

        if(head == null || head.next == null) return null; // edge case –> empty LL or 1 Node in LL

        Node temp = head;
        while (temp.next.next != null){ // I need to stop at second before last
            temp = temp.next;
        }
        temp.next = null; // second before last points to null = now is the last element
        return head;
    }
}
