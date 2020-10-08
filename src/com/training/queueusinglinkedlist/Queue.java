package com.training.queueusinglinkedlist;

import com.training.queueusinglinkedlist.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T value){
        queue.addNodeLast(value);
    }

    public void display(){
        queue.printList();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();
    }


}