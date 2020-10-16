
public class Person implements Cloneable {
	
	private String name;
	private String gender;
	private int age;
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Person clonePerson() {
		Person temp = null;
		
		try {
			temp = (Person) this.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return temp;
	}
	
	public void describe() {
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
