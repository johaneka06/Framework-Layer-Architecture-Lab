package main;

import adapter.charger.SamsungCharger;
import adapter.lightning.IphonePort;
import adapter.typec.LightningAdapter;
import adapter.typec.SamsungPort;
import builder.samsung.Samsung;
import builder.samsung.builder.SamsungBuilder;

public class Main {

	public Main() {
		SamsungCharger samsungCharger = SamsungCharger.getInstance(); //Pakai singleton
		IphonePort iphonePort = new IphonePort();
		SamsungPort samsungPort = new SamsungPort();
		
		samsungCharger.charge(samsungPort);
		
		LightningAdapter lightningAdapter = new LightningAdapter(iphonePort);
		
		samsungCharger.charge(lightningAdapter);
		
		//Builder
		SamsungBuilder samsungBuilder = new SamsungBuilder();
		Samsung samsung = samsungBuilder.buildRam("4GB").getSamsung();
		samsung.data();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
