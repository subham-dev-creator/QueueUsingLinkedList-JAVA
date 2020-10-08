package com.training.queueusinglinkedlist;

import com.training.queueusinglinkedlist.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // Add Value in queue
    public void enqueue(T value){
        queue.addNodeLast(value);
    }

    // Print Queue
    public void display(){
        queue.printList();
    }

    // Remove element from queue
    public void dequeue(){
        queue.deleteNodeFront();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();
        queue.dequeue();
        queue.display();
    }


}