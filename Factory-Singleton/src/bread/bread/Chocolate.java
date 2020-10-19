package bread.bread;

public class Chocolate extends Bread {

	public Chocolate() {
		this.breadName = "Chocolate Bread";
	}

	@Override
	public Bread makeBread() {
		return new Chocolate();
	}

}
