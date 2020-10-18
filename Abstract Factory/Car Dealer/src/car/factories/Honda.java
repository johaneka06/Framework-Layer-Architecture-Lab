package car.factories;

import car.components.engine.*;
import car.components.nos.*;
import car.components.tire.*;
import car.components.transmission.*;
import car.components.turbo.*;

public class Honda implements CarFactory {

	public Honda() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Engine buildEngine() {
		return new V4Engine();
	}

	@Override
	public Transmission buildTransmission() {
		return new SingleClutch();
	}

	@Override
	public Turbo buildTurbo() {
		return new SingleScrollTurbo();
	}

	@Override
	public Tire buildTyre() {
		return new Radial();
	}

	@Override
	public NOS buildNos() {
		// TODO Auto-generated method stub
		return new WetSinglePoint();
	}

}
