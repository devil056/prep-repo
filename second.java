class LinkedListTest{
	
	Node head;
	int size;

	class Node{
		int data;
		Node next;

		public Node(){}

		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	void addNode(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
			size++;
		}else{
			newNode.next=head;
			head=newNode;
			size++;
		}
		
	}

	void printList(){
		Node currNode = head;

		if(head==null){
			System.out.println("The list is empty and there is nothing to print");
		}
		while(currNode!=null){
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args){
		LinkedListTest llt = new LinkedListTest();
		llt.addNode(0);
		llt.addNode(1);
		llt.addNode(2);
		llt.printList();
		System.out.println("Size of the list is : "+llt.size);
	}
}
