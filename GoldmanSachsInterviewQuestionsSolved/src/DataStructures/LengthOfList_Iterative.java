package DataStructures;

public class LengthOfList_Iterative {
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
	
	public int getCount() {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		LengthOfList_Iterative l = new LengthOfList_Iterative();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		
		System.out.println("Length of list :" +l.getCount());
	}

}
