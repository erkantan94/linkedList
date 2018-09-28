package com.erkan;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.display();
        list.insert(1, 2);
        list.display();
        list.add(8);
        list.add("aa");
        list.display();
        list.insert(3, "bb");
        list.display();
    }
}
