package builder.samsung.builder;

import builder.samsung.Samsung;

public class SamsungBuilder {

	/*
	 * Kalau mau ditambahin singleton, stepnya kaya gini:
	 * Bikin private instance
	 * Bikin private cosntructor
	 * Bikin get instance
	*/
	
	private Samsung samsung;

	public SamsungBuilder() {
		samsung = new Samsung();
	}
	
	public SamsungBuilder buildRam(String ram) {
		samsung.setRam(ram);
		return this;
	}
	
	public SamsungBuilder buildDuration(String duration) {
		samsung.setDuration(duration);
		return this;
	}
	
	public SamsungBuilder buildStorage(String storage) {
		samsung.setStorage(storage);
		return this;
	}

	public Samsung getSamsung() {
		return samsung;
	}

}
