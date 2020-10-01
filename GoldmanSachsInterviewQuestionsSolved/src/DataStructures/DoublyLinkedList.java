package DataStructures;

public class DoublyLinkedList {
	Node head;

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;

		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	public void printList(Node node) {
		Node last = null;
		System.out.println("Traversal in forward direction: ");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction: ");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();
		l.push(2);
		l.push(4);
		l.push(5);
		l.push(6);
		
		l.printList(l.head);

	}

}
