package main;

import car.manufactories.*;
import car.models.*;

public class Main {

	public Main() {
		CarManufactor bmw = new BMWManufactor();
		CarManufactor mercedes = new MercedesManufactor();
		CarManufactor honda = new HondaManufacturor();
		
		System.out.println("BMW Steet");
		Car bmwStreet = bmw.createCar("street");
		System.out.println();
		System.out.println("BMW Racing");
		Car bmwRacing = bmw.createCar("racing");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Mercedes Steet");
		Car mercedesStreet = mercedes.createCar("street");
		System.out.println();
		System.out.println("BMW Racing");
		Car MercedesRacing = mercedes.createCar("racing");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Honda Steet");
		Car hondaStreet = honda.createCar("street");
		System.out.println();
		System.out.println("Honda Racing");
		Car HondaRacing = honda.createCar("racing");
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
