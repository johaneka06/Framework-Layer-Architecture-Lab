package car.models;

import car.components.engine.*;
import car.components.tire.*;
import car.components.transmission.*;
import car.components.turbo.*;
import car.components.nos.*;
import car.factories.*;

public abstract class Car {

	protected Engine engine;
	protected Tire tire;
	protected Transmission transmission;
	protected Turbo turbo;
	protected NOS nos;
	protected CarFactory factory;
	
	public Car(CarFactory factory) {
		this.factory = factory;
	}
	
	public abstract void build();
	
	public void describe() {
		engine.describe();
		turbo.describe();
		transmission.describe();
		tire.describe();
		if(nos != null) nos.describe();;
	}

}
