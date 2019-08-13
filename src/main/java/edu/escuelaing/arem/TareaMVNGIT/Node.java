package edu.escuelaing.arem.TareaMVNGIT;

public class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
