package adapter.charger;

import adapter.typec.TypeC;

public class SamsungCharger {
	
	private static SamsungCharger instance; //Singleton = constructor harus tidak boleh diakses public. Ga boleh new new secara sembarangan
	
	private SamsungCharger() {
		// TODO Auto-generated constructor stub
	}
	
	//Method public = digunakan untuk akses instace samsung charger
	
	//Dibuat thread-safe
	public synchronized static SamsungCharger getInstance() {
		//Lazy loading
		if(instance == null) {
			instance = new SamsungCharger();
		}
		
		return instance;
	}
	
	public void charge(TypeC typeC) {
		typeC.chargeWithTypeC();
	}

}
