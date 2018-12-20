package org.interview.threads;

public class ThreadClass extends Thread{
	int[] arr;
	
	public ThreadClass(String name, int[] a){
		super(name);
		arr = a;
		this.start();
	}
	
	public void run(){
		ArraySum arraySum = new ArraySum();
		synchronized(arraySum){
			arraySum.sum(arr);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		ThreadClass a = new ThreadClass("a", arr);
		ThreadClass b = new ThreadClass("b", arr);
		
		try {
			a.join();
			System.out.println("a has completed execution");
			
			b.join();
			System.out.println("B has completed execution");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
