package car.factories;

import car.components.engine.*;
import car.components.nos.*;
import car.components.tire.*;
import car.components.transmission.*;
import car.components.turbo.*;

public class BMW implements CarFactory {

	public BMW() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Engine buildEngine() {
		return new V6Engine();
	}

	@Override
	public Transmission buildTransmission() {
		// TODO Auto-generated method stub
		return new DualClutch();
	}

	@Override
	public Turbo buildTurbo() {
		// TODO Auto-generated method stub
		return new TwinScrollTurbo();
	}

	@Override
	public Tire buildTyre() {
		// TODO Auto-generated method stub
		return new RunFlatTire();
	}

	@Override
	public NOS buildNos() {
		// TODO Auto-generated method stub
		return new Dry();
	}

}
