
public class Main {
	
	public Main() {
		Person daniel = new Person("Daniel", "Male", 20);
		
		Person luis = daniel.clonePerson();
		luis.setName("Luis");
		luis.setAge(21);
		
		daniel.describe();
		luis.describe();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
