public class Node<T> {
	
	//fields
	private T data;
	private Node<T> next;
	
	//constructor
	Node(T data)
	{
		this.data = data;
		this.next = null;
	}
	
	//constructor 2
	Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}

	/**
	 * returns data of the node
	 * @return data
	 */
	public T getValue() {
		return data;
	}

	/**
	 * sets the value of the node
	 */
	public void setValue(T data) {
		this.data = data;
	}

	/**
	 * shows the next node
	 * @return next
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * sets the next node
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	/**
	 * returns whether there is a next one or not
	 * @return true or false
	 */
	public boolean hasNext() {
		return (next != null);
	}
}
