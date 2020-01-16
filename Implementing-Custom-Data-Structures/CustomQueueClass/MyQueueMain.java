public class MyQueueMain {
	public static void main(String[] args) {
		MyQueue<Person> line = new MyQueue<Person>();
		line.printInfo();
		
		Person mom = new Person("Mom", 43);
		Person dad = new Person("Dad", 45);
		Person ch1 = new Person("Daughter", 20);
		Person ch2 = new Person("Son", 14);
		Person ch3 = new Person("Daughter", 12);
		
		line.add(mom);
		line.printInfo();
		
		line.add(dad);
		line.printInfo();

		line.add(ch3);
		line.add(ch2);
		line.printInfo();
		
		try {
			line.remove();
			line.printInfo();
			
			line.add(ch1);
			line.printInfo();
			
			line.remove();
			line.printInfo();
	
			line.remove();
			line.printInfo();
			
			line.remove();
			line.printInfo();
			
			line.remove();
			line.printInfo();
			
			line.remove();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
