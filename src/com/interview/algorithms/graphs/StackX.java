package com.interview.algorithms.graphs;

public class StackX {
	
	private int[] stack;
	private final int SIZE = 20;
	private int top;
	
	public StackX(){
		stack = new int[SIZE];
		top = -1;
	}
	
	public void push(int n){
		stack[++top]=n;
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public int peek(){
		return stack[top];
	}
	
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}

}
