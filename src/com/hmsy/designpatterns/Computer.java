package com.hmsy.designpatterns;

public class Computer {
	
	private int ram;
	private int hdd;
	
	private boolean bluetoothEnabled;
	private boolean wifiEnabled;
	
	public Computer(ComputerBuilder builder){
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.wifiEnabled = builder.wifiEnabled;
		this.bluetoothEnabled = builder.bluetoothEnabled;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public boolean isBluetoothEnabled() {
		return bluetoothEnabled;
	}
	public void setBluetoothEnabled(boolean bluetoothEnabled) {
		this.bluetoothEnabled = bluetoothEnabled;
	}
	public boolean isWifiEnabled() {
		return wifiEnabled;
	}
	public void setWifiEnabled(boolean wifiEnabled) {
		this.wifiEnabled = wifiEnabled;
	}
	
	public static void main(String[] args){
		ComputerBuilder builder = new ComputerBuilder();
		Computer comp = builder.hdd(100).ram(5000).bluetoothEnabled(true).wifiEnabled(false).build();
		
		System.out.println(comp.toString());
	}
	
	public String toString(){
		return "Ram:" + this.ram + "\nHDD:"+ this.hdd + "\nbluetoothEnabled:"+ this.bluetoothEnabled 
				+ "\nwifiEnabled: "+ this.wifiEnabled;
	}

}
