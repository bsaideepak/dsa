class Node{
	int data;
	Node leftChild;
	Node rightChild;

	public Node(){
	}

	public Node(int d){
		this.data = d;
	}
}

class BinaryTree{
	Node root;

	public BinaryTree(){
		root = new Node();
	}

	public void insert(int d){
		if(root == null){
			root.data = d;
		}
		else{
			Node n = new Node(d);

			Node current = root;
			Node parent = root;

			while(true){
				parent = current;
				if(d < current.data){
					current = current.leftChild;
					if(current == null){
						parent.leftChild = n;
						return;
					}
				}else{
					current = current.rightChild;
					if(current == null){
						parent.rightChild = n;
						return;
					}
				}
			}
		}
	}

	public Node find(int key){
		Node current = root;
		while(current.data !=key){
			if(key < current.data){
				current = current.leftChild;
			}
			else{
				current = current.rightChild;
			}

			if(current == null){
				return;
			}
		}
		return current;
	}

	//Inorder Traversal
	public void inOrder(Node root){
		if(root != null){
			inOrder(root.leftChild);
			System.out.println(root.data + " ");
			inOrder(root.rightChild);
		}
	}

	//Pre-Order Traversal
	public void preOrder(Node root){
		if(root != null){
			System.out.println(root.data + " ");
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}

	//Post-Order Traversal
	public void postOrder(Node root){
		if(root != null){
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.println(root.data + " ");
		}
	}

	//Delete Tree Node.

	//Huffman Code.
}