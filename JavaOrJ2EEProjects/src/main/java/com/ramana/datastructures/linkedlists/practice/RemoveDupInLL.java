/**
 * 
 */
package com.ramana.datastructures.linkedlists.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class RemoveDupInLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		customLinkedList();
	}

	/**
	 * 
	 */
	private static void customLinkedList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nodes you want to enter: ");
		int n = sc.nextInt();
		System.out.println("Insert your node data here: ");
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			list.append(sc.nextInt());
		}
		System.out.println("I want to insert element before head: ");
		list.insertBefore(new Node(sc.nextInt()));
		list.display();
		System.out.println(list.length());
		System.out.println("I want to insert another element after: " + list.getNode(1));
		list.insertAfter(new Node(sc.nextInt()), list.getNode(1));
		list.display();
		list.removeDupNodes();
//TODO:Not completed
		sc.close();
	}

}