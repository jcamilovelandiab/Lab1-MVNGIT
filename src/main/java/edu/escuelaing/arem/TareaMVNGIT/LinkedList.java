package edu.escuelaing.arem.TareaMVNGIT;

import java.io.*;

public class LinkedList {
	
	private Node head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public int getHead() {
		return this.head.data;
	}
	
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
	
	public int find(int index) {
		Node temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int suma() {
		int s = 0;
		Node temp = head;
		while(temp != null) {
			s+= temp.data;
			temp = temp.next;
		}
		return s;
	}
	
}
