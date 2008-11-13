public class StackList {

	private Node head, curr, prev;
	private int size;

	public StackList(){
	  curr = null;
	  head = null;
	  prev = null;
	  size = 0;
	}
	
    // Judy Bishop's implementation is wrong.
    // If you check membership in the list by advancing until eol, 
    // you are at the end of the list and got a null pointer exception for add.
    // We have to differentiate adding at the start, at the very end, or in the middle
	
	public void add (Object x) {
	  // Very first element
	  if (head == null) {
	    head = new Node (x, null);
	    curr = head;
	  } else 
	  {
		if (curr == null){
	    // prev is pointing to last element  
	       curr = new Node(x, curr);
	       prev.next = curr;
	       prev = curr;
		} else
		{  
		// we are somewhere in the middle of the list
	       Node tmp = new Node (x, curr.next);
		   curr.next = tmp;
		   prev      = curr;
		   curr      = tmp;
		};	  
	  }
	  size = size + 1;
	}
	
	// And the above always inserts *after* curr. It would be
	// so much easier to just add at the start, so I made a new
	// method.
	public void addFirst(Object o){
		Node tmp = new Node (o, head);
		head = tmp;
		prev = null;
		curr = head;
	}

	public void remove () {
	  if (this.isEmpty () || curr == null){ 
	    return;
	  } else {
	    if (prev == null) { 
	      head = curr.next;
	      curr = head;
	    } else {
	      prev.next = curr.next;
	      curr = curr.next;
	    }
	    size = size - 1;
	  }
	}

	public boolean isEmpty () {
	  return head == null;
	}

	public Object current () {
	  return curr.data;
	}
	
	public int getSize(){
	  return this.size;
	}

	public void reset() {
	  curr = head;
	  prev = null;
	  // note: this only resets the running pointer, not the list!
	  // size remains the same
	} 

	public boolean eol() {
	  return (curr == null); 
	}

	public void succ() {
	  curr = curr.next;
	  if (prev == null)
	    prev = head;
	  else
	    prev = prev.next;
	}
	
	// If empty strings are given, use a list default
	public String print(String open, String close) {
		String s = (open == "")?"[ ":open;
		for (this.reset();!this.eol();this.succ()){
			// this wastes a lot of system data
			s = s + curr.data + ((curr.next != null)?", ":"");
		}
		return s + ((close == "")?" ]":close);
	}
}
