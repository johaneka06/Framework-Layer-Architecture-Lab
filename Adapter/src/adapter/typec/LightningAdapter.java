package adapter.typec;

import adapter.lightning.IphonePort;

public class LightningAdapter implements TypeC{
	
	private IphonePort iPort;

	public LightningAdapter(IphonePort iPort) {
		this.iPort = iPort;
	}

	@Override
	public void chargeWithTypeC() {
		iPort.chargeWithLightning();
	}

}
