package com.kunalkushwaha.likedlst;

public class LinkedList {

	Node head;
	static int size=0;

	public void insertFirst(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
		size++;
		System.out.println("size of ll now : " + size);
	}

	public Node lastNode() {
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		return lastNode;
	}

	public void insertAtLast(int element) {
		if (head == null) {
			insertFirst(element);
		}
		Node temp = new Node();
		temp.data = element;
		Node last = lastNode();
		last.next = temp;
		size++;
		System.out.println("size of ll now : " + size);
	}
	
	public void insertAtIndex(int index,int element) {
		if(index==0) {
			insertFirst(element);
		}else if(index==size) {
			insertAtLast(element);
		}else {
			Node temp= new Node();
			temp.data=element;
			Node node =head;
			for(int i=1;i<index;i++) {
			node= node.next;
			}
			temp.next=node.next;
			node.next=temp;			
		}
		size++;
		System.out.println("size of ll now : "+ size);
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
	}

}
