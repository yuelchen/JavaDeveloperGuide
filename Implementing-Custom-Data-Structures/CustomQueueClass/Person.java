public class Person {
	private Person nextPerson; 
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;		
		this.nextPerson = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setNextPerson(Person person) {
		this.nextPerson = person;
	}
	
	public Person getNextPerson() {
		return this.nextPerson;
	}
	
	public String toString() {
		return this.name + " is " + this.age + " year old";
	}
}
