package bread.bread;

public class Banana extends Bread {

	public Banana() {
		this.breadName = "Banana Bread";
	}

	@Override
	public Bread makeBread() {
		return new Banana();
	}

}
