package com.kunalkushwaha.stack;

public class CustomStack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	private static int top = -1;

	public CustomStack() {
		this(DEFAULT_SIZE);
	}

	public CustomStack(int size) {
		data = new int[size];
	}

	public boolean stackUnderflow() {
		return top == -1;
	}

	public boolean stackOverflow() {
		return top == data.length - 1;
	}

	public void push(int element) throws StackException {
		if (stackOverflow()) {
			throw new StackException("Can't insert in an already full stack");
		} else {
			data[++top] = element;
		}
	}

	public int pop() {
		int poppedElement = 0;
		if (stackUnderflow()) {
			System.out.println("nothing to pop");
			return 0;
		} else {
			poppedElement = data[top--];
			return poppedElement;
		}
	}
	public int peek() throws StackException {
		if(this.stackUnderflow()){
			throw new StackException("Nothing to show");
		}
		return data[top];
	}
	
	public void print() {
		System.out.println("value of top : "+top);
		for(int i=0;i<=top;i++) {
			System.out.print(data[i]+" ");
			
		}
	}
}
