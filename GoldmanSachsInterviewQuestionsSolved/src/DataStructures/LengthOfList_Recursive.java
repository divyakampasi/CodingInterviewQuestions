package DataStructures;

public class LengthOfList_Recursive {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}
	
	int getCountRec(Node node) {
		if(node == null)
			return 0;
		
		return 1+getCountRec(node.next);
	}
	
	public int getCount() {
		return getCountRec(head);
	}

	public static void main(String[] args) {
		LengthOfList_Recursive l = new LengthOfList_Recursive();
		l.push(2);
		l.push(4);
		l.push(7);
		l.push(5);
		
		System.out.println("Length of list : "+l.getCount());
	}

}
