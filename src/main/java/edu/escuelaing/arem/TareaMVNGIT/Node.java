package edu.escuelaing.arem.TareaMVNGIT;

/**
 * @author Juan Camilo Velandia Botello
 */
public class Node {

	int data;
	Node next;
	
	/**
	 * Node Constructor. It receives as parameter the node's value
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	/**
	 * @param data Node's value
	 * @param next This is the pointer. I am pointing to another node
	 */
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
