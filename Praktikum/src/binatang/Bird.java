package binatang;

public class Bird extends Animal {

	private String featherColor;
	
	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

	public Bird(String name, String featherColor) {
		super(name);
		this.featherColor = featherColor;
	}

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Bird() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Lagi makan cuy");
		
	}

}
