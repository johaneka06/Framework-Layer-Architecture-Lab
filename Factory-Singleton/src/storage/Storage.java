package storage;

import java.util.Vector;

import bread.bread.*;

public class Storage {
	
	private Vector<Bread> vBread;
	private int chocolate;
	private int strawberry;
	private int banana;
	
	private static Storage instance;
	
	private Storage() {
		vBread = new Vector<>();
		chocolate = strawberry = banana = 10;
	}
	
	public synchronized static Storage getInstance() {
		if(instance == null) {
			instance = new Storage();
		}
		
		return instance;
	}
	
	public boolean add(String bread) {
		if(bread.equals("Chocolate") && chocolate > 0) {
			vBread.add(new Chocolate());
			
			chocolate--;
			
			return true;
		} else if(bread.equals("Strawberry") && strawberry > 0) {
			vBread.add(new Strawberry());
			
			strawberry--;
			
			return true;
		} else if(bread.equals("Banana") && banana > 0) {
			vBread.add(new Banana());
			
			banana--;
			
			return true;
		}
		
		return false;
	}
	
	public void show() {
		int chocolateBread = 0;
		int strawberryBread = 0;
		int bananaBread = 0;
		
		for (Bread bread : vBread) {
			if(bread instanceof Chocolate) chocolateBread++;
			else if (bread instanceof Strawberry) strawberryBread++;
			else if(bread instanceof Banana) bananaBread++;
		}
		
		System.out.println("Storage Status");
		System.out.println("--------------");
		System.out.println("Chocolate: " + chocolate);
		System.out.println("Strawberry: " + strawberry);
		System.out.println("Banana: " + banana);
		System.out.println();
		System.out.println("Fresh Bread Stock");
		System.out.println("-----------------");
		System.out.println("Chocolate Bread: " + chocolateBread);
		System.out.println("Strawberry Bread: " + strawberryBread);
		System.out.println("Banana Bread: " + bananaBread);
	}

}
