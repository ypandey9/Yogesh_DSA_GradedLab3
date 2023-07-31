package com.lab3.solution2.pairsum;

import java.util.Set;
import java.util.HashSet;

public class PairSum {
	public static class Node {
		int data;
		Node left;
		Node right;
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	public Node insertData(Node root, int value) {
		if (root == null) {
			return newNode(value);
		}
		if (root.data > value) {
			root.left = insertData(root.left, value);
		} else {
			root.right = insertData(root.right, value);
		}
		return root;

	}

	public boolean findPairUtil(Node root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;
		}
		if (findPairUtil(root.left, sum, set)) {
			return true;
		}
		if (set.contains(sum - root.data)) {
			System.out.println("Sum="+sum);
			System.out.println("Pair is (" + (sum - root.data) + "," + root.data+")");
			return true;
		} else {
			set.add(root.data);
		}
		return findPairUtil(root.right, sum, set);
	}

	public void findPairWithSum(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		boolean result = findPairUtil(root, sum, set);
		if (!result) {
			System.out.println("nodes are not found ");
		}
	}

}
