import pizza.Pizza;
import pizza.builder.PizzaBuilder;

public class Main {
	
	public Main() {
//		Pizza pizza = new Pizza("Thin Crust", "Tomato", "Mozarella", null, true, null, true, null, true, null);
//		pizza.describe();
		
		PizzaBuilder builder = new PizzaBuilder();
		
		Pizza pizza = builder.setDough("Thin Crust").setSauce("BBQ").setCheese("Permesan").makePizza();
		
		Pizza pizza2 = builder.setChicken(true).makePizza();
		
		pizza.describe();
		System.out.println();
		pizza2.describe();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
