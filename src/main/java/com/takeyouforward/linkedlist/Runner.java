package com.takeyouforward.linkedlist;

public class Runner {

    private static void print (Node head){
        while(head != null){
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] arr = {2, 5, 8, 7};
        Node head = Node.convertArrayToLinkedList(arr);
//        System.out.println(Node.lengthOfALinkedList(head));
//        System.out.println(Node.checkIfPresentInLinkedList(head, 3));

        head = Node.removesHead(head);
        print(head);
    }
}
