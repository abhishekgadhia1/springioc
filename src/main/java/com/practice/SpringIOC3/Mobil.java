package com.practice.SpringIOC3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobil {

	public static void main(String[] args) throws BeansException {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file loaded...");
		
		Sim sim = ac.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		

	}

}
