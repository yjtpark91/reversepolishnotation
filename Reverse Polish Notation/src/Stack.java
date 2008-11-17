
public class Stack<T> implements StackInterface<T>{

	//fields
	private LinkedList<T> myStack;
	private static int MAXIMUM_ELEMENTS = 1000000;
	
	//constructor (a new stack should be empty)
	public Stack() {
		this.Empty();
	}

	/**
	 * returns if the stack is empty or not
	 * @return is empty
	 */
	public boolean isEmpty() {
		return myStack.isEmpty();
	}

	/**
	 * removes the element on top of the stack
	 */
	public void pop() throws StackUnderflow {
		if(myStack.isEmpty()) throw new StackUnderflow();		
		myStack.remove();
	}

	/**
	 * adds a new element on top of the stack
	 * @param T new element
	 */
	public void push(T o) throws StackOverflow {
		// only valid objects
		if(o == null) 
			return;
		if (myStack.getSize()> MAXIMUM_ELEMENTS) 
			throw new StackOverflow();
		myStack.add(o);
	}

	/**
	 * get the element on top of the stack
	 * @return T top element
	 */
	public T top() throws StackUnderflow {
		if(myStack.isEmpty()) throw new StackUnderflow();				
		return myStack.current();
	}

	/**
	 * returns the size of the stack
	 * @return int
	 */
	public int getSize() {
		return myStack.getSize();
	}
	
	/**
	 * returns a representing string of the stack
	 * @return String
	 */
	public String print() {
		return myStack.toString();
	}

	/**
	 * clears the stack
	 */
	public void Empty() {
		myStack = new LinkedList<T>();
	}
}
