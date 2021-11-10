package com.demo.customdoublelinkedlist;

public class LinkedList {

	private Node head;
	private int size;

	public int size() {
		return size;
	}

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		if (head == null) {
			head = node;
			head.prev = null;
			size++;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
			size++;
		}
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		if (head == null) {
			head = node;
			head.prev = null;
			size++;
		} else {
			node.prev = null;
			node.next = head;
			head = node;
			size++;
		}
	}

	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = node;
		node.prev = n;
		size++;
	}

	public void insertBefore(int beforeData, int data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		Node n = head;
		Node n2 = null;

		if (beforeData == head.data) {
			node.prev = null;
			node.next = head;
			head = node;
			size++;
		} else {
			while (n.data != beforeData) {
				n2 = n;
				n = n.next;
			}
			n2.next = node;
			node.prev = n2;
			node.next = n;
			size++;
		}
	}

	public void insertAfter(int afterData, int data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		Node n = head;
		Node n2 = null;

		if (afterData == head.data) {
			n2 = n.next;
			head.next = node;
			node.prev = head;
			node.next = n2;
			size++;
		} else {
			while (n.data != afterData) {
				n = n.next;
				n2 = n.next;
			}
			n.next = node;
			node.prev = n;
			node.next = n2;
			size++;
		}
	}

	public boolean delete(int data) {
		Node n = head;
		if (data == head.data) {
			if (head.next == null && head.prev == null) {
				head = null;
				size--;
				return true;
			} else {
				head = head.next;
				head.prev = null;
				size--;
				return true;
			}
		}

		for (int i = 0; i < size(); i++) {
			if (n.data == data) {
				if (n.next != null) {
					n.prev.next = n.next;
					n.next.prev = n.prev;
					size--;
					return true;
				} else {
					n.prev.next = null;
					size--;
				}
			}
			n = n.next;
		}
		return false;
	}

	public void show() {
		Node n = head;
		if (n == null) {
			System.out.println("no data in the linked list");
		} else {
			while (n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
}
