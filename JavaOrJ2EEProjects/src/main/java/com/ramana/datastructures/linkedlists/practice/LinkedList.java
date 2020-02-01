/**
 * 
 */
package com.ramana.datastructures.linkedlists.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author RamanaGorle
 *
 */
public class LinkedList {
	Node head; // head of list
	
	/* Appends a new node at the end.  This method is 
	   defined inside LinkedList class shown above */
	public void append(int new_data)
	{
	    Node new_node = new Node(new_data);
	 
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	 
	    new_node.next = null;
	 
	    Node last = head; 
	    while (last.next != null)
	        last = last.next;
	    last.next = new_node;
	    return;
	}
	public void insertBefore(Node new_node){
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAfter(Node new_node, Node prev_node){
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	public void deleteNode(Node delete_node){
		if(head ==delete_node){
			head.next = head;
			head = null;
		}
		Node last = head;
		while(last.next != null){
			if(last == delete_node){
				last = last.next;
				last = null;
			}
			last = last.next;
		}
	}
	public Node getNode(int position){
		if(position == 0){
			return head;
		}
		Node last = head;
		int length = 0;
		while(last.next !=null){
			length++;
			if(length == position){
				return last.next;
			}
			last = last.next;
		}
		return null;
	}
	public void display(){
		if(head==null){
			System.out.println("LinkedList is empty, add some nodes to it");
		}
		Node last = head;
		System.out.println("The below is the list of nodes");
		while(last.next !=null){
			System.out.println(last.data);
			last = last.next;
		}
		System.out.println(last.data);
	}
	
	public int length(){
		int length = 0;
		if(head == null){
			return 0;
		}
		Node last = head;
		while(last.next !=null){
			last = last.next;
			length++;
		}
		return length+1;
	}
	public boolean removeDupNodes(){
		Map<Integer, Integer> map = new HashMap<>();
		Node last = head;
		while(last.next != null){
			if(map.containsKey(last.data)){
				last.next = last.prev.next;
				last = last.prev;
			} else {
				map.put(last.data, 1);
			}
			last.prev = last;
			last = last.next;
		}
		
		System.out.println("Displaying the map values");
		for(Entry<Integer, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		return false;
	}
}
