public interface StackInterface<T> {
	
	public void push (T o);
	public void pop () throws StackUnderflow;
	public Object top () throws StackUnderflow;
	public boolean isEmpty ();
	public void Empty ();
	public String print();
}