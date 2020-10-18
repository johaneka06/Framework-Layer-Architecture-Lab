package factory.recipes;

import factory.filling.*;
import factory.topping.*;

public class ChocolateCheeseSpecial extends Recipes {

	public ChocolateCheeseSpecial() {
		this.name = "Chocolate Cheese Special";
	}

	@Override
	public Filling createFilling() {
		return new Chocolate();
	}

	@Override
	public Topping createTopping() {
		// TODO Auto-generated method stub
		return new Cheese();
	}

}
