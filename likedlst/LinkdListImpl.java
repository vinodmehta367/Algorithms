package com.kunalkushwaha.likedlst;

public class LinkdListImpl {
public static void main(String[] args) {
	LinkedList customList =  new LinkedList();
	customList.insertFirst(5);
	customList.insertFirst(45);
	customList.insertFirst(17);
	customList.print();
	customList.insertAtLast(53);
	customList.print();
	customList.insertAtIndex(3, 65);
	customList.print();
}
}
