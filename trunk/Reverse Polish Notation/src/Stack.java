
public class Stack implements StackInterface {

	private StackList myStack;
	
	public Stack () {
		this.Empty();
	}
	
	public void Empty() {
      myStack = new StackList();
	}

	public boolean isEmpty() {
		return myStack.isEmpty();
	}

	public void pop() throws StackUnderflow {
		if (myStack.isEmpty()){
			throw new StackUnderflow();
		} else {
			// chop off the first one, so make sure we are at the top
			myStack.reset();
			myStack.remove();
		}
	}

	public void push(Object o) {
		// All pushing is done on the front
		myStack.addFirst(o);

	}

	public Object top() throws StackUnderflow {
		myStack.reset();
		return myStack.current();
	}
	
	public String print (){
		return myStack.print("Top:", ":Bottom");
	}

}