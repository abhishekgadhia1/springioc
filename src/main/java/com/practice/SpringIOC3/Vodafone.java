package com.practice.SpringIOC3;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using Vodafone sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("using data with Vodafone sim");
		
	}

}
