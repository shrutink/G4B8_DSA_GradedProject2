package com.gl.main;

import com.gl.service.SkewwedTrans;

public class SkewwedMain {

	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	public static void main(String[] args) {
		

		SkewwedTrans trans = new SkewwedTrans();
		SkewwedMain.node = new Node(50);
		SkewwedMain.node.left = new Node(30);
		SkewwedMain.node.right = new Node(60);
		SkewwedMain.node.left.left = new Node(10);
		SkewwedMain.node.right.left = new Node(55);

		int order = 0;
		headNode = trans.flattenBTToSkewed(node, order);
		trans.traverseRightSkewed(headNode);
	}
}
