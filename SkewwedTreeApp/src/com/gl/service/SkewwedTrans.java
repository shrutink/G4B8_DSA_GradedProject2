package com.gl.service;

import com.gl.main.Node;

public class SkewwedTrans {
	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	// Function to to flatten the binary
	// search tree into a skewed tree in
	// increasing / decreasing order
	public Node flattenBTToSkewed(Node node2, int order) {

		// Base Case
		if (node2 == null) {
			return null;
		}

		// Condition to check the order
		// in which the skewed tree to
		// maintained
		if (order > 0) {
			flattenBTToSkewed(node2.right, order);
		} else {
			flattenBTToSkewed(node2.left, order);
		}
		Node rightNode = node2.right;
		Node leftNode = node2.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = node2;
			node2.left = null;
			prevNode = node2;
		} else {
			prevNode.right = node2;
			node2.left = null;
			prevNode = node2;
		}

		// Similarly recurse for the left / right
		// subtree on the basis of the order required
		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);
		}
		return headNode;
	}

	// Function to traverse the right
	// skewed tree using recursion
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

}
