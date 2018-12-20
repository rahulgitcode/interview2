package org.interview.threads;

import java.util.Scanner;

public class ThreadOne extends Thread{
	private volatile boolean running = true;
	public void run(){
		while(running){
			for(int i=0; i<10; i++){
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public void shutdown(){
		running = false;
	}
}

class MainApp{
	
	public static void main(String[] args){
		ThreadOne t1 = new ThreadOne();
		
		t1.start();
		
		Scanner inp = new Scanner(System.in);
		inp.nextLine();
		
		t1.shutdown();
	}
}
