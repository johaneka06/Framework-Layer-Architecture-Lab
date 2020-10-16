package binatang;

public class Cat extends Animal {

	private String feathercolor;
	
	public String getFeathercolor() {
		return feathercolor;
	}

	public void setFeathercolor(String feathercolor) {
		this.feathercolor = feathercolor;
	}

	public Cat(String name, String feathercolor) {
		super(name);
		this.feathercolor = feathercolor;
	}
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Makan cuy");
		
	}

}
