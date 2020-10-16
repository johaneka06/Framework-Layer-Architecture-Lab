package pizza;

public class Pizza {
	
	private String dough;
	private String sauce;
	private String cheese;
	private Boolean pepperoni;
	private Boolean sausage;
	private Boolean chicken;
	private Boolean beef;
	private Boolean tuna;
	private Boolean pepper;
	private Boolean mushroom;
	
	public Pizza() { }
	
	public Pizza(String dough, String sauce, String cheese, Boolean pepperoni, Boolean sausage, Boolean chicken,
			Boolean beef, Boolean tuna, Boolean pepper, Boolean mushroom) {
		super();
		this.dough = dough;
		this.sauce = sauce;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.sausage = sausage;
		this.chicken = chicken;
		this.beef = beef;
		this.tuna = tuna;
		this.pepper = pepper;
		this.mushroom = mushroom;
	}
	
	public void describe() {
		System.out.println("Dough : " + (dough == null ? "No dough" : dough));
		System.out.println("Sauce : " + (sauce == null ? "No sauce" : sauce));
		System.out.println("Cheese : " + (cheese == null ? "No cheese" : cheese));
		System.out.println("Pepperoni : " + (pepperoni == null ? "No pepperoni" : "With pepperoni"));
		System.out.println("Sausage : " + (sausage == null ? "No sausage" : "With sausage"));
		System.out.println("Chicken : " + (chicken == null ? "No chicken" : "With chicken"));
		System.out.println("Beef : " + (beef == null ? "No beef" : "With beef"));
		System.out.println("Tuna : " + (tuna == null ? "No tuna" : "With tuna"));
		System.out.println("Pepper : " + (pepper == null ? "No pepper" : "With pepper"));
		System.out.println("Mushroom : " + (mushroom == null ? "No mushroom" : "With mushroom"));
	}
	
	public String getDough() {
		return dough;
	}
	
	public void setDough(String dough) {
		this.dough = dough;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public String getCheese() {
		return cheese;
	}
	
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	public Boolean getPepperoni() {
		return pepperoni;
	}
	
	public void setPepperoni(Boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	
	public Boolean getSausage() {
		return sausage;
	}
	
	public void setSausage(Boolean sausage) {
		this.sausage = sausage;
	}
	
	public Boolean getChicken() {
		return chicken;
	}
	
	public void setChicken(Boolean chicken) {
		this.chicken = chicken;
	}
	
	public Boolean getBeef() {
		return beef;
	}
	
	public void setBeef(Boolean beef) {
		this.beef = beef;
	}
	
	public Boolean getTuna() {
		return tuna;
	}
	
	public void setTuna(Boolean tuna) {
		this.tuna = tuna;
	}
	
	public Boolean getPepper() {
		return pepper;
	}
	
	public void setPepper(Boolean pepper) {
		this.pepper = pepper;
	}
	
	public Boolean getMushroom() {
		return mushroom;
	}
	
	public void setMushroom(Boolean mushroom) {
		this.mushroom = mushroom;
	}

}
