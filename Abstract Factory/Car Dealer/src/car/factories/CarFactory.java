package car.factories;

import car.components.engine.*;
import car.components.tire.*;
import car.components.transmission.*;
import car.components.turbo.*;
import car.components.nos.*;

public interface CarFactory {
	public Engine buildEngine();
	public Transmission buildTransmission();
	public Turbo buildTurbo();
	public Tire buildTyre();
	public NOS buildNos();
}
