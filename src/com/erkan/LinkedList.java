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
    //delete an element at a specified index
    public void delete(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("out of list");

        Node temp;
        if (index == 0) {
            if (head.next != null) {
                temp = head.next;
                head = temp;
            } else {
                head = null;
                tail = null;
                current = null;
            }
            return;
        }

        current = head;
        for (int i = 1; i < index; i++) {
            if (current.next != null)
                current = current.next;
            else
                throw new ArrayIndexOutOfBoundsException("out of list");
        }

        if (current.next == null)
            throw new ArrayIndexOutOfBoundsException("out of list");

        if (current.next == tail) {
            current.next = null;
            tail = current;
        } else {
            temp = current.next;
            temp = temp.next;
            current.next = temp;
        }

    }

    //get an element at a specified index
    public Object get(int index) {
        current = head;
        int i = 0;
        while (current != null) {
            if (i == index)
                return current.getData();
            current = current.next;
            i++;
        }
        return null;
    }

    public boolean contains(Object obj) {
        current = head;
        while (current != null) {
            if (current.getData().equals(obj))
                return true;
            current = current.next;
        }
        return false;
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

