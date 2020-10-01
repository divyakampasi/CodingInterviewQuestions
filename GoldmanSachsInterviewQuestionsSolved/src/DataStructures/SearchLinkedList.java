package DataStructures;

public class SearchLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public boolean search(Node head, int x) {
		Node current = head;
		while(current!=null) {
			if(current.data == x)
				return true;
			current = current.next;
		}
		return false;
	}

	public static void main(String[] args) {
		SearchLinkedList l = new SearchLinkedList();
		l.push(11);
		l.push(7);
		l.push(3);
		l.push(4);
		
		if(l.search(l.head, 11))
			System.out.println("Key found");
		else
			System.out.println("Key not found");
		
	}

}
