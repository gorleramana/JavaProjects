/**
 * 
 */
package com.ramana.datastructures.graphs.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author RamanaGorle
 * 
 *         facebook
 */
public class Graph {
	int n;
	private LinkedList<String> ll;
	private Map<String, LinkedList<String>> adj;

	public Graph(int data) {
		this.n = data;
		adj = new HashMap<>();
		ll = new LinkedList<String>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.ll.add("a");
		g.ll.add("b");
		g.ll.add("c");
		g.ll.add("d");
		g.ll.add("e");
		LinkedList<String> a = new LinkedList<String>();
		a.add("b");
		a.add("c");
		g.adj.put("a", a);
		LinkedList<String> b = new LinkedList<String>();
		b.add("a");
		g.adj.put("b", b);
		LinkedList<String> c = new LinkedList<String>();
		c.add("a");
		c.add("d");
		g.adj.put("c", c);
		LinkedList<String> d = new LinkedList<String>();
		d.add("c");
		g.adj.put("d", d);
		LinkedList<String> e = new LinkedList<String>();
		g.adj.put("e", e);
		if (g.isReachable("a", "d")) {
			System.out.println("There is a path b/w given nodes");
		} else {
			System.out.println("There is no path b/w given nodes");
		}
	}

	private boolean isReachable(String first, String second) {
		Map<String, Boolean> visited = new HashMap<>();
		LinkedList<String> queue = new LinkedList<String>();
		visited.put(first, true);
		queue.add(first);
		Iterator<String> i;
		while (queue.size() != 0) {
			String s = queue.poll();
			i = adj.get(s).listIterator();
			while (i.hasNext()) {
				String node = i.next();
				if (node.equals(second)) {
					// System.out.println("Path: ");
					// for(int j=0;j<queue.size();j++){
					// System.out.print(queue.poll());
					// }
					return true;
				}
				if (!visited.containsKey(node)) {
					visited.put(node, true);
					queue.add(node);
				}
			}
		}
		return false;
	}

}