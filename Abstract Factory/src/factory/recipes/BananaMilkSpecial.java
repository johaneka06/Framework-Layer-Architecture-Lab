package factory.recipes;

import factory.filling.*;
import factory.topping.*;

public class BananaMilkSpecial extends Recipes {

	public BananaMilkSpecial() {
		this.name = "Banana Milk Special";
	}

	@Override
	public Filling createFilling() {
		// TODO Auto-generated method stub
		return new Banana();
	}

	@Override
	public Topping createTopping() {
		// TODO Auto-generated method stub
		return new Milk();
	}

}
