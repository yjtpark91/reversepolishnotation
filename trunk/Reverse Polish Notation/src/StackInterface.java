/**
 * Überschrift: 
 * 
 * Beschreibung: 
 * A trivial interface for a stack
 *  
 * Copyright:
 * Copyright (c) 2006 Organisation: FHTW
 * 
 * @author Debora Weber-Wulff
 * @version 1.0
 */

public interface StackInterface<T> {
	
	/**
	 * Method throws Exception now, changed on 15th Nov. 2008 by Keven Bauke
	 * Added because of the OutOfMemoryError
	 */
	public void push(T o) throws StackOverflow;
	public void pop() throws StackUnderflow;
	public T top() throws StackUnderflow;
	public boolean isEmpty();
	public void Empty();
	
	/**
	 * Added new method on 15th Nov. 2008 by Keven Bauke
	 * Keeps store of the size of the stack
	 */
	public int getSize();
	public String print();
}
