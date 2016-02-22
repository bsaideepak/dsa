// Heap.java
// demonstrates heaps
// to run this program: C>java HeapApp
import java.io.*; //////////////////////////////////////////////////////////////// class Node
class Node
{
	private int iData; // data item (key)
	
	public Node(int key) // constructor{ 
		iData = key; 
	}
	
	public int getKey() { return iData; }
	
	public void setKey(int id){ 
		iData = id; 
	}
} // end class Node //////////////////////////////////////////////////////////////// 

class Heap{

	private Node[] heapArray;
	private int maxSize; // size of array
	private int currentSize; // number of nodes in array
	
	public Heap(int mx){

		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize]; // create array 
	}
	
	public boolean isEmpty(){ 
		return currentSize==0; 
	}

	public boolean insert(int key) {
		if(currentSize==maxSize) 
			return false;

		Node newNode = new Node(key); 
		heapArray[currentSize] = newNode; 
		trickleUp(currentSize++);
		return true;
	} 

	public void trickleUp(int index){
		int parent = (index-1) / 2; 
		Node bottom = heapArray[index];
		
		while( index > 0 && heapArray[parent].getKey() < bottom.getKey() ){
			heapArray[index] = heapArray[parent]; // move it down index = parent;
			parent = (parent-1) / 2;
		} 
		
		heapArray[index] = bottom;
	} 

	public Node remove(){  
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize]; 
		trickleDown(0);
		return root;
	} 

	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index]; 

		while(index < currentSize/2){
			int leftChild = 2*index+1; 
			int rightChild = leftChild+1;
			if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) 
				largerChild = rightChild;
			else
				largerChild = leftChild;
			
			if( top.getKey() >= heapArray[largerChild].getKey() )
				break;
			
			heapArray[index] = heapArray[largerChild];
			index = largerChild; // go down
		}
		
		heapArray[index] = top; // root to index
	} 
} 