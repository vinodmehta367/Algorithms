package com.kunalkushwaha.queue;

public class CircularQueue {

    protected int[] data;
    protected static final int DEFAULT_SIZE=10;
    protected int rear=-1;
    protected int front=-1;

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return (rear+1)% data.length == front;
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    public void enqueue(int element) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is already full!");
        }else if(rear==-1 && front==-1){
            rear++;
            front++;
        }else{
            rear=(rear+1)% data.length;
        }
        data[rear]=element;

    }

    public void printQueue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Can't print empty queue");
        }
        // use only for simple queue
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + "->");
        }
    }
        public void printCicularQueue() throws QueueException{
            if (isEmpty()) {
                throw new QueueException("Can't print empty queue");
            }
        //print for circular queue
        for (int a:data){
            System.out.print(a+"->");
        }
    }

    public int dequeue() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Can't dequeue an already empty queue");
        }else if(front==rear){
            front=rear=-1;
            throw new QueueException("Queue is now empty!");
        }
        front=(front+1)% data.length;
        return data[front];
    }
}
