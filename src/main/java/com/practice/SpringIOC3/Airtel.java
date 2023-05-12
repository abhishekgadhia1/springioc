package com.practice.SpringIOC3;

public class Airtel implements Sim{
	
	public Airtel() {
		// TODO Auto-generated constructor stub
		System.out.println("airtel constructor called...");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using Airtel sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("using data with Airtel sim");
		
	}

}
