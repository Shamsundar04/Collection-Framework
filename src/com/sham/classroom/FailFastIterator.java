package com.sham.classroom;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.Vector;

class City extends Thread{
	
	private Vector<String> vector;
	
	public City(Vector<String> vector) {
		this.vector=vector;
	}
	
	@Override
	public void run() {
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		vector.add("Beed");
	}
}

public class FailFastIterator {
	public static void main(String[] args) throws InterruptedException {
		
		Vector<String> cities=new Vector<>();
				
		cities.add("Hyd");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Latur");
		cities.add("Dharashiv");
		
		City city=new City(cities);
		
		city.start();
		
		Iterator<String> itr = cities.iterator();	
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			Thread.sleep(500);
		}
	}
}
