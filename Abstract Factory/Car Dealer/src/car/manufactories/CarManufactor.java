package car.manufactories;

import car.factories.*;
import car.models.Car;

public abstract class CarManufactor {
	
	protected CarFactory factory;
	
	public CarManufactor() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Car buildCar(String type);
	
	public Car createCar(String type) {
		Car car = buildCar(type);
		
		car.build();
		car.describe();
		return car;
		
	}

}
