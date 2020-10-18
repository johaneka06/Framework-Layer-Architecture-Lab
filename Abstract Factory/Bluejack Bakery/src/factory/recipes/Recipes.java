package factory.recipes;

import factory.filling.*;
import factory.topping.*;

public abstract class Recipes {

	protected String name;
	
	public Recipes() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Filling createFilling();
	public abstract Topping createTopping();

	public String getName() {
		return name;
	}

}
