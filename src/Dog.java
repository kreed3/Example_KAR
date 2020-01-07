
public class Dog {

	// Instance Fields
	private String name;
	private int age;
	
	//Constructors
	public Dog() {
		name = "null";
		age = 0;
	} // end empty-argument constructor
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	} // end preferred constructor Dog
	
	
	public String bark() {
		return "Bark, bark, bark!!!";
	}
	
	// Getters, Setters, toString
	public String getName() {
		return name;
	} // end getName
	
	public void setName(String name) {
		this.name = name;
	} // end setName
	
	public int getAge() {
		return age;
	} // end getAge
	
	public void setAge(int age) {
		this.age = age;
	} // end setAge

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	} // end toString
			
} // end class
