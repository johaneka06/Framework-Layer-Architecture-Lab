package car.models;

import car.factories.CarFactory;

public class Racing extends Car {

	public Racing(CarFactory factory) {
		super(factory);
	}

	@Override
	public void build() {
		this.engine = this.factory.buildEngine();
		this.nos = this.factory.buildNos();
		this.tire = this.factory.buildTyre();
		this.transmission = this.factory.buildTransmission();
		this.turbo = this.factory.buildTurbo();
	}

}
