/**
 * 
 */
package com.ramana.datastructures.stacks.practice;

import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class TowerOfHanoi {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		int diskNumber = 3;
		Tower[] towers = new Tower[3];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
//		for (int i = diskNumber - 1; i >= 0; i--) {
//			towers[0].add(i);
//		}
		System.out.println("Displaying values of Tower 1: ");
		towers[0].add(9);towers[0].add(8);towers[0].add(7);
		for(int j=0;j<3;j++){
			System.out.println(towers[0].disk.get(j));
		}
		System.out.println("Moving values from Tower 1 to 3: ");
		towers[0].moveDisks(diskNumber, towers[1], towers[2]);
		System.out.println("Displaying Tower 3 values: ");
		for(int j=0;j<3;j++){
			System.out.println(towers[2].disk.get(j));
		}
	}

}

/**
 * Solution: To move N disks from tower A to tower B: 1. move top N -1 disks
 * from tower A to tower C 2. move N'th disk from tower A to tower B 3. move top
 * N-1 disks from tower C to tower B
 * 
 * @Runtime & spaces runtime: O(2^n) space: O(n)
 * 
 */
class Tower {
	Stack<Integer> disk;
	int index;

	public Tower(int i) {
		disk = new Stack<Integer>();
		index = i;
	}

	public void moveDisks(int diskNumber, Tower buffer, Tower destination) throws Exception {
		if (diskNumber > 0) {
			moveDisks(diskNumber - 1, destination, buffer);
			moveTo(destination);
			buffer.moveDisks(diskNumber - 1, this, destination);
		} else {
			return;
		}
	}

	public void moveTo(Tower destination) throws Exception {
		int t = disk.pop();
		destination.add(t);
		System.out.println("Now moving " + t + " from " + this.index + " to " + destination.index);
	}

	public void add(int x) throws Exception {
		if (!disk.isEmpty() && disk.peek() < x) {
			throw new Exception("Error placing disk: " + x);
		} else {
			disk.push(x);
		}
	}
}
