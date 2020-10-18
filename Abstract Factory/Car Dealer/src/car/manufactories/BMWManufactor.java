package car.manufactories;

import car.factories.*;
import car.models.Car;
import car.models.*;

public class BMWManufactor extends CarManufactor {
	
	public BMWManufactor() {
		factory = new BMW();
	}

	@Override
	public Car buildCar(String type) {
		Car car = null;
		
		if(type.equalsIgnoreCase("Racing")) car = new Racing(factory);
		else if(type.equalsIgnoreCase("Street")) car = new Street(factory);
		
		return car;
	}

}
