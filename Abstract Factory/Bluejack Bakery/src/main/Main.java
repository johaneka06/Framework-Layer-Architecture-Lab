package main;

import java.util.*;
import factory.recipes.*;

public class Main {
	
	Vector<Recipes> vRecipes;
	Scanner scan = new Scanner(System.in);
	Recipes recipe;
	
	private void cls() {
		for(int i = 1; i <= 30; i++) System.out.println();
	}
	
	private void init() {
		this.vRecipes = new Vector<>();
	}
	
	private void printVector() {
		int counter = 1;
		
		System.out.println("Total Breads: " + vRecipes.size());
		System.out.println("===============");
		System.out.println("List of Breads:");
		
		if(vRecipes.size() > 0) {
			for (Recipes recipes : vRecipes) {
				System.out.println(counter++ + ". " + recipes.getName());
			}
		}
		
		System.out.println("===============");
		
	}
	
	private void printMenu() {
		System.out.println("Create New Bread");
		System.out.println("1. Chocolate Cheese Special");
		System.out.println("2. Banana Milk Special");
		System.out.println("3. EXIT");
	}
	
	public Main() {
		int opt = 0;
		
		init();
		
		do {
			cls();
			System.out.println("==========================");
			System.out.println("Welcome to Bluejack Bakery");
			System.out.println("==========================");
			System.out.println();
			
			printVector();
			System.out.println();
			
			printMenu();
			
			boolean flag = false;
			
			do {
				flag = false;
				System.out.print("Input Choice: ");
				
				try {
					opt = scan.nextInt();
				} catch (Exception e) {
					flag = true;
					System.err.println("Input number only!");
				}
				
			} while (opt < 1 || opt > 3 || flag);
			
			if(opt == 1) {
				recipe = new ChocolateCheeseSpecial();
			} else {
				recipe = new BananaMilkSpecial();
			}
			
			vRecipes.add(recipe);
			
		} while(opt != 3);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
