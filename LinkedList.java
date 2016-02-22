class Node {
	int data;
	Node next;
	//Node previous; => Doubly linked node. Bad on space complexity. 

	public Node(int d){
		this.data = d;
	}
}

class LinkedList {
	Node first;  	//Used for simple linked list, stack and queue implementations.
	Node last;		/*Used only for queue implementation of linked list. This list is a doubly ended linked list. It is different from doubly linked list. */

	public LinkedList(){
		first = null;
		last = null;
	}

	public void insertAtStart(int d) {   /* Stack Implementation. D -> C -> B -> A Using just a single reference, the next. */
		Node n = new Node(d);
		n.next = first;
		first = n;
	}

	public void insertAtEnd(int d) {  /* Queue Implementation. A -> B -> C -> D Using next reference to insert. */
		Node n = new Node(d);
		n.next = last;
		last = n;
	}

	public Node removeFromStart() {   /* Both Stack and Queue implementations. Stack: C -> B -> A ; Queue: B -> C -> D */
		Node n = first;
		first = first.next;
		return n;
	}

	/*
	 * This implementation of delete assumes a doubly linked list. All of above is DOUBLY ENDED list NOT DOUBLY LINKED.

	public void deleteFromLast() {  
		Node n = last;
		last = last.previous; 	//This is asuming the linked list Node class maintained previous Node reference along with next.
		n = null;
	}
	*/

	public static void main(String args) throws IOException {
		LinkedList[] l;  //Array of LinkedLists
		int size = 
		//Call Functions using LinkedList object l
	}
}