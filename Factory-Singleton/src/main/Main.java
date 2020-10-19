package main;

import java.util.Scanner;

import bread.factories.Factories;
import storage.Storage;

public class Main {
	
	private void cls() {
		for(int i = 1; i <= 30; i++) System.out.println();
	}
	
	private void printStatus(Storage storage) {
		System.out.println("==========================");
		System.out.println("Welcome to Bluejack Bakery");
		System.out.println("==========================");
		System.out.println();
		storage.show();
		System.out.println("=========================");
	}
	
	
	public Main() {
		String opt;
		Scanner scan = new Scanner(System.in);
		Storage storage = Storage.getInstance();
		
		while(true) {
			cls();
			printStatus(storage);
			
			do {
				System.out.print("Input bread to bake [Chocolate | Strawberry | Banana]: ");
				opt = scan.nextLine();
			} while(!(opt.equals("Chocolate") || opt.equals("Strawberry") || opt.equals("Banana")));
			
			if(!storage.add(Factories.create(opt))) {
				System.out.println("Insufficient Ingredients");
				scan.nextLine();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
