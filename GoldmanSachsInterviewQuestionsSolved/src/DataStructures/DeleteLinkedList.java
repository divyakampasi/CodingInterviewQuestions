package DataStructures;
//Time Complexity : O(n) Space Complexity : O(1)
public class DeleteLinkedList {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void deleteList() {
		head = null;
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node n = head;
		if(n==null) {
			System.out.println("Linked List Empty");
		}
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DeleteLinkedList l = new DeleteLinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		
		l.printList();
		l.deleteList();
		l.printList();
		
	}

}
