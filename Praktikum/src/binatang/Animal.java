package binatang;

public abstract class Animal {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void eat();

}
