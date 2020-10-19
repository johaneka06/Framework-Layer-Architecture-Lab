package bread.factories;

import bread.bread.*;

public class Factories {

	public Factories() { }

	public static Bread create(String type) {
		if(type.equals("Chocolate")) return new Chocolate();
		else if (type.equals("Strawberry")) return new Strawberry();
		else if (type.equals("Banana")) return new Banana();
		
		return null;
	}

}
