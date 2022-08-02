package com.kunalkushwaha.stack;

public class FixedSizeStack {
public static void main(String[] args) throws StackException{
	//CustomStack stack = new CustomStack(5);
	GrowableStack stack = new GrowableStack(5);
	stack.push(10);
	stack.push(15);
	stack.push(25);
	stack.push(67);
	stack.push(75);
	System.out.println("Stack size before overflow: "+stack.data.length);
	stack.print();
	/*System.out.println(stack.pop());
	System.out.println(stack.pop());
*/
	System.out.println("Element At top: "+stack.peek());;
	System.out.println("--------------------------");
	stack.push(89);
	System.out.println("Stack size after overflow: "+stack.data.length);
	stack.push(99);
	stack.print();
}
}
