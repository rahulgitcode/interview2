package org.interview.datastructures;

public class Link {
	public String name;
	public int value;
	public Link next;
	
	public Link(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	public void display(){
		System.out.println("Link Name: "+ this.name + " ,Link Value: "+ this.value);
	}
	
}
