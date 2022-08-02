package com.kunalkushwaha.queue;

public class QueImpl {
    public static void main(String[] args) throws QueueException {
        //CustomQueue queue = new CustomQueue(8);
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(15);
        queue.enqueue(45);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(92);
        /*queue.enqueue(95);
        queue.enqueue(55);
        queue.enqueue(65);
        queue.enqueue(5);
*/

        queue.printQueue();

        System.out.println("Removed element: "+queue.dequeue());
        System.out.println("Removed element: "+queue.dequeue());
        queue.printQueue();
        System.out.println("-----------------------------");

        queue.enqueue(33);
        queue.enqueue(11);
        queue.printCicularQueue();
    }
}
