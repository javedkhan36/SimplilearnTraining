package com.simplilearn.collection;

import java.util.Scanner;

public class SinglyLinkedList {
	
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {

		Node new_node = new Node(data);
		// First element in the node
		if (list.head == null) {
			list.head = new_node;
		} else {

			Node last = list.head;

			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	
	public static void printList(SinglyLinkedList list) {
		
		Node temp = list.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {

		Node curr_node = list.head;
		Node prev_node = null;

		
		if (curr_node != null & curr_node.data == key) {
			
			list.head = curr_node.next;
			System.out.println(key + " found and deleted from linkedList");
			return list;
		}

		while (curr_node != null && curr_node.data != key) {
			prev_node = curr_node;
			curr_node = curr_node.next;
		}

				if (curr_node != null) {
			prev_node.next = curr_node.next;
			System.out.println(key + " found and deleted from linkedlist");
		} else {
			System.out.println(key + " Not found in linkedlist");
		}
		return list;
	}

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		int count = 5;
		
		while(count!=0) {
			Scanner scanner = new Scanner(System.in);
			int element = scanner.nextInt();
			list.insert(list, element);
			count--;
		}
		
		list.printList(list);
		System.out.println();
		
		System.out.println("************");
		System.out.println("Please enter element to be deleted:");
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		list.deleteByKey(list, element);
		System.out.println("List after deletion");
		list.printList(list);
		
		}
}
