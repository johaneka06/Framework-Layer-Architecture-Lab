package car.models;

import car.factories.*;

public class Street extends Car {

	public Street(CarFactory factory) {
		super(factory);
	}

	@Override
	public void build() {
		this.engine = this.factory.buildEngine();
		this.tire = this.factory.buildTyre();
		this.transmission = this.factory.buildTransmission();
		this.turbo = this.factory.buildTurbo();
	}

}
