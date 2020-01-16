public class MyStack<T extends Plate> {
	private T t; //top of stack of type T objects
	private int size;
	
	public MyStack(){
		this.t = null;
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void push(T obj) {
		//if stack is empty, assign as top of stack immediately 
		if(this.t == null) {
			this.t = obj;
		}
		//else if make new object as top of stack
		else {
			obj.setNextPlate(this.t);
			this.t = obj;
		}
		
		this.size++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws Exception {
		//if stack is not empty, then store current object and make head point to next plate
		if(this.t == null) {
			throw new Exception("EmptyStackException reached, the stack is empty and has no plates");
		}

		try {
			T temp = this.t;
			this.t = (T) this.t.getNextPlate();
			this.size--;
			return temp;
		}
		catch(ClassCastException e) {
			throw new Exception("ClassCastException reached, next plate is not of type Plate");
		}
	}
	
	public T peek() throws Exception {
		if(this.t == null) {
			throw new Exception("EmptyStackException reached, the stack is empty and has no plates");
		}
		
		return this.t;
	}
	
	public void clear() {
		this.t = null;
		this.size = 0;
	}
	
	public void printInfo() {
		if(this.size == 0) {
			System.out.println("Stack is empty...");
		}
		else if(this.size > 0) {
			System.out.println("There are " + this.size + " objects in Stack; top object description is '" + t.toString() + "'");
		}
	}
}
