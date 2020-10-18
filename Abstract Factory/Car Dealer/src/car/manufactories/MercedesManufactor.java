package car.manufactories;

import car.factories.Mercedes;
import car.models.Car;
import car.models.Racing;
import car.models.Street;

public class MercedesManufactor extends CarManufactor {

	public MercedesManufactor() {
		factory = new Mercedes();
	}

	@Override
	public Car buildCar(String type) {
		Car car = null;
		
		if(type.equalsIgnoreCase("Racing")) car = new Racing(factory);
		else if(type.equalsIgnoreCase("Street")) car = new Street(factory);
		
		return car;
	}

}
