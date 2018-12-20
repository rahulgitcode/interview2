package com.hmsy.designpatterns;

public class ComputerBuilder {
	
	int ram;
	int hdd;
	
	boolean bluetoothEnabled;
	boolean wifiEnabled;
	
	ComputerBuilder(){
	}
	
	ComputerBuilder(int ram,int hdd){
		this.ram = ram;
		this.hdd = hdd;
	}
	
	ComputerBuilder ram(int ram){
		this.ram = ram;
		return this;
	}
	
	ComputerBuilder hdd(int hdd){
		this.hdd = hdd;
		return this;
	}
	
	ComputerBuilder bluetoothEnabled(boolean bluetoothEnabled){
		this.bluetoothEnabled = bluetoothEnabled;
		return this;
	}
	
	ComputerBuilder wifiEnabled(boolean wifiEnabled){
		this.wifiEnabled = wifiEnabled;
		return this;
	}
	
	public Computer build(){
		return new Computer(this);
	}
	

}
