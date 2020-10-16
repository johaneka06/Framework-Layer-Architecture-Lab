package pizza.builder;

import pizza.Pizza;

public class PizzaBuilder {

	Pizza pizza;
	
	public PizzaBuilder() {
		pizza = new Pizza();
	}
	
	public Pizza makePizza() {
		Pizza temp = pizza;
		pizza = new Pizza();
		
		return temp;
	}
	
	public PizzaBuilder setDough(String dough) {
		pizza.setDough(dough);
		return this;
	}
	
	public PizzaBuilder setSauce(String sauce) {
		pizza.setSauce(sauce);;
		return this;
	}
	
	public PizzaBuilder setCheese(String cheese) {
		pizza.setCheese(cheese);
		return this;
	}
	
	public PizzaBuilder setSausage(boolean sausage) {
		pizza.setSausage(sausage);
		return this;
	}
	
	public PizzaBuilder setChicken(boolean chicken) {
		pizza.setChicken(chicken);;
		return this;
	}
	
	public PizzaBuilder setBeef(boolean beef) {
		pizza.setBeef(beef);
		return this;
	}
	
	public PizzaBuilder setTuna(boolean tuna) {
		pizza.setTuna(tuna);
		return this;
	}
	
	public PizzaBuilder setPepper(boolean pepper) {
		pizza.setPepper(pepper);
		return this;
	}
	
	public PizzaBuilder setMushroom(boolean mushroom) {
		pizza.setMushroom(mushroom);
		return this;
	}

}
