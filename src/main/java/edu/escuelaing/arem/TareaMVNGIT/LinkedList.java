package edu.escuelaing.arem.TareaMVNGIT;

import java.io.*;

/**
 * 
 * @author Juan Camilo Velandia Botello
 */
public class LinkedList {
	
	private Node head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Obtain the head data
	 * @return head data
	 */
	public int getHead() {
		return this.head.data;
	}
	
	/**
	 * Add an element to the linkedlist
	 * @param data
	 */
	public void add_back(int data) {
		Node new_node = new Node(data);
		if(this.head == null) {
			this.head = new_node;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		this.size++;
	}
	
	/**
	 * Remove the first element with the value of data
	 * @param data
	 */
	public void remove(int data) {
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			if(temp.data==data) {
				size--;
				prev.next=temp.next;
				break;
			}
			prev = temp;
			temp=temp.next;
		}
	}
	
	/**
	 * Obtain the element's value at the position index
	 * @param index
	 * @return data
	 */
	public int find(int index) {
		Node temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	/**
	 * Print all elements in the linkedlist
	 */
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	/**
	 * Obtain the linkedlist's size
	 * @return size
	 */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Obtain the sum of all elements in the linkedlist
	 * @return sum
	 */
	public int sum() {
		int s = 0;
		Node temp = head;
		while(temp != null) {
			s+= temp.data;
			temp = temp.next;
		}
		return s;
	}
	
}
