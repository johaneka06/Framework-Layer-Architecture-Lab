package car.factories;

import car.components.engine.*;
import car.components.nos.*;
import car.components.tire.*;
import car.components.transmission.*;
import car.components.turbo.*;

public class Mercedes implements CarFactory {

	public Mercedes() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Engine buildEngine() {
		return new V8Engine();
	}

	@Override
	public Transmission buildTransmission() {
		return new DualClutch();
	}

	@Override
	public Turbo buildTurbo() {
		return new TwinScrollTurbo();
	}

	@Override
	public Tire buildTyre() {
		return new Bias();
	}

	@Override
	public NOS buildNos() {
		// TODO Auto-generated method stub
		return new WetMultiPoint();
	}

}
