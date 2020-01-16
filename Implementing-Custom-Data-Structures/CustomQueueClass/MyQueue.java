public class MyQueue<T extends Person>{
	private T first; //head
	private T last; //tail
	private int size; 
	
	public MyQueue() {
		this.size = 0;
		this.first = null;
		this.last = null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void add(T t) {
		//if there is no one on line, then simply make first and last point to the given person
		if(this.first == null) {
			this.first = t;
			this.last = t;
		}
		//else make current last next person equal to newest person in queue and have last point ot new last person
		else {
			this.last.setNextPerson(t);
			this.last = t;
		}
		
		//increment size either way
		this.size++;
	}
	
	@SuppressWarnings("unchecked")
	public T remove() throws Exception {
		//if queue is empty, then throw exception
		if(this.first == null) {
			throw new Exception("EmptyQueueException reached, there are no object in queue");
		}
		
		//else if queue is not empty, then store current first temporarily, have first point to the next object in line and if no objects, set both first and last to null
		T temp = this.first;
		if(this.first.getNextPerson() == null) {
			this.first = null;
			this.last = null;
			this.size = 0;
			
			System.out.println("Last person " + temp.toString() + " has been removed from the line");
			return temp;
		}
		else{
			try {
				this.first = (T) this.first.getNextPerson();
				this.size--;
				
				System.out.println("First person '" + temp.toString() + " has been removed from the line");
				return temp;
			}
			catch(ClassCastException e) {
				throw new Exception("ClassCastException reached, next Person is not of type Person (T)");
			}
		}
	}
	
	public T peekFirst() throws Exception {
		//if queue is empty, then throw exception
		if(this.first == null) {
			throw new Exception("EmptyQueueException reached, there are no object in queue");
		}
		
		return this.first;
	}
	
	public T peekLast() throws Exception {
		//if queue is empty, then throw exception
		if(this.last == null) {
			throw new Exception("EmptyQueueException reached, there are no object in queue");
		}
		
		return this.last;
	}
	
	public void clear() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void printInfo() {
		if(this.size == 0) {
			System.out.println("Stack is empty...");
		}
		else if(this.size > 0) {
			System.out.println("There are " + this.size + " objects in Stack; first object description is '" + this.first.toString() + "' and last is '" + this.last.toString() + "'");
		}
	}
}
