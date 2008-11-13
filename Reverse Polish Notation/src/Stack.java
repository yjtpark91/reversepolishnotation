
public class Stack<T> implements StackInterface<T> {

	private StackList myStack;
	
	public Stack( ) {
		myStack = new StackList( );
	}

	@Override
	public void Empty() {
		return myStack.Empty();
	}

	@Override
	public boolean isEmpty() {
		return myStack.isEmpty( );
	}

	@Override
	public void pop() throws StackUnderflow {
		myStack.pop();
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(T o) {
		myStack.push(o); 	
	}

	public Object top() throws StackUnderflow {
		// TODO Auto-generated method stub
		return null;
	}
}