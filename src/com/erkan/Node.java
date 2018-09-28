package com.erkan;

public class Node {

    private Object data;
    public Node next;

    public Node(Object data, Node node) {
        this.data = data;
        this.next = node;
    }

    public Object getData() {
        return data;
    }
}
