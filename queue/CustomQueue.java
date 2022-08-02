package com.kunalkushwaha.queue;

public class CustomQueue {

protected int[] data;
protected static final int DEFAULT_SIZE=10;
protected int rear=-1;
protected int front=-1;

public CustomQueue(int size){
    this.data=new int[size];
}

public CustomQueue(){
    this(DEFAULT_SIZE);
}

public boolean isFull(){
    return rear == data.length-1;
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
        rear++;
    }
    data[rear]=element;

}

public void printQueue() throws QueueException{
    if (isEmpty()){
        throw new QueueException("Can't print empty queue");
    }
    for (int i=front;i<=rear;i++){
        System.out.print(data[i]+"->");
    }
}

public int dequeue() throws QueueException{
    if(isEmpty()){
        throw new QueueException("Can't dequeue an already empty queue");
    }else if(front==rear){
        front=rear=-1;
        throw new QueueException("Queue is now empty!");
    }
return data[front++];
}
}
