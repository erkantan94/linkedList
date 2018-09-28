package com.erkan;


public class LinkedList {

    private Node head;
    private Node tail;
    private Node current;

    public LinkedList() {
        head = null;
        tail = null;
        current = null;
    }

    //appends an element to end of the list
    public void add(Object obj) {
        if (head == null) {
            head = tail = new Node(obj, null);
            current = tail;
        } else {
            tail.next = new Node(obj, null);
            tail = tail.next;
            current = tail;
        }
    }

    //inserts an element at a specified index
    public void insert(int index, Object obj) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("out of the list");
        Node temp;

        for (int i = 0; i < index; i++) {
            if (i == 0)
                current = head;
            else
                current = current.next;
        }

        if (index == 0) {
            temp = head;
            head = new Node(obj, temp);
            current = head;
        } else if (current == tail) {
            add(obj);
        } else {
            temp = current.next;
            current.next = new Node(obj, temp);
            current = current.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

}

