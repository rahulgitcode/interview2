package org.interview.datastructures;

public class LinkedList {
	public Link firstLink;
	
	LinkedList(){
		firstLink = null;
	}
	
	public boolean isEmpty(){
		if(firstLink == null){
			return true;
		}
		return false;
	}
	
	public boolean insertAtFirst(String name, int value){
		
		Link newLink = new Link(name,value);
		
		newLink.next = firstLink;
		
		firstLink= newLink;
		
		return true;
	}
	
	public Link deleteFirst(){
		Link temp = firstLink;
		firstLink = firstLink.next;
		return temp;
	}
	
	public void printLinkedList(){
		if(isEmpty()){
			System.out.println("LinkedList is empty");
			return;
		}
		
		Link start = firstLink;
		
		while(start != null){
			start.display();
			start = start.next;
		}
		return;
	}
	
	public static void main(String[] args){
		LinkedList newList = new LinkedList();
		
		newList.insertAtFirst("Rahul", 6915);
		newList.insertAtFirst("Niki", 1234);
		newList.printLinkedList();
		newList.deleteFirst();
		newList.printLinkedList();
		
	}
}
