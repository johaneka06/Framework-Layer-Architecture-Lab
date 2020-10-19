package bread.bread;

import storage.Storage;

public abstract class Bread {

	protected int count = 0;
	protected String breadName;
	protected Storage storage;
	
	public abstract Bread makeBread();

}
