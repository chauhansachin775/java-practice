package com.demo.customlinkedlist;

public class LinkedList {

	private Node head;
	private int size = 0;

	public int size() {
		return size;
	}

	public void add(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			size++;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			size++;
		}
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			size++;
		} else {
			node.next = head;
			head = node;
			size++;
		}
	}

	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node n = head;

		while (n.next != null) {
			n = n.next;
		}
		n.next = node;
		size++;
	}

	public void insertBefore(int beforeData, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node n = head;
		Node n2 = null;

		if (beforeData == head.data) {
			node.next = head;
			head = node;
			size++;
		} else {
			while (n.data != beforeData) {
				n2 = n;
				n = n.next;
			}
			n2.next = node;
			node.next = n;
			size++;
		}
	}

	public void insertAfter(int afterData, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node n = head;
		Node n2 = null;

		while (n.data != afterData) {
			n = n.next;
			n2 = n.next;
		}
		n.next = node;
		node.next = n2;
		size++;
	}

	public boolean search(int data) {
		Node n = head;
		for (int i = 0; i < size(); i++) {
			if (n.data == data)
				return true;
			n = n.next;
		}
		return false;
	}

	public void delete(int data) {
		Node n = head;
		Node n2 = null;
		while (n.data != data) {
			n2 = n;
			n = n.next;
		}
		n2.next = n.next;
		size--;
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
