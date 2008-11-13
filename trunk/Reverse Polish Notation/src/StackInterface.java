public interface StackInterface {
	public void push (Object o);
	public void pop () throws StackUnderflow;
	public Object top () throws StackUnderflow;
	public boolean isEmpty ();
	public void Empty ();
	public String print();
}