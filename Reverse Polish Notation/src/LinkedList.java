
public class LinkedList<T> {

	//fields
	private Node<T> head, current;
	private int size;

	//constructor
	public LinkedList() {
		current = null;
		head = null;
		size = 0;
	}
	
	/**
	 * clears the whole list
	 */
	public void Empty() {
		head = null;
		size = 0;
	}

	/**
	 * returns if the list is empty or not
	 * @return is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * adds an element to the list
	 * @param T new element
	 */
	public void add(T o){
		Node<T> newNode = new Node<T>(o, head);
		this.head = newNode;
		current = head;
		size ++;
	}

	/**
	 * removes an element to the list
	 */
	public void remove () {
		if (this.isEmpty () || current == null)
		    return;
		else {
			head = head.getNext();
			size --;
		}
	}

	/**
	 * gets the element where the pointer is at
	 * @return T an element
	 */
	public T current () {
		 return head.getValue();
	}
	
	/**
	 * gets the size of the list
	 * @return int
	 */
	public int getSize(){
		return this.size;
	}
	
	/**
	 * formats the list into a string
	 * @return String
	 */
	public String toString() {
		String formatedString = "[";
		Node<T> next = head;
		//as long as there is an element
		while(next != null)
		{
			//to avoid a "," after the last element
			formatedString += next.getValue() + ((next.hasNext()) ? "," : "");
			//move on to the next
			next = next.getNext();
		}
		return formatedString + "]";
	}
}
