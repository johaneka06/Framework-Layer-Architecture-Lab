package bread.bread;

public class Strawberry extends Bread {

	public Strawberry() {
		this.breadName = "Strawberry Bread";
	}

	@Override
	public Bread makeBread() {
		return new Strawberry();
	}

}
