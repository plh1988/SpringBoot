package com.pradeep.trees;

public class Application {

	public static void main(String[] args) {
		
		DocumentTree newTree = new DocumentTree();
		newTree.setRoot(new Node(1,"node root"));
		newTree.getRoot().addChildNode(new Node(2,"child node1"));
		newTree.getRoot().addChildNode(new Node(3,"child node2"));
		newTree.getRoot().getChildNode(2).addChildNode(new Node(5, "child node4"));
		newTree.readTree();
	}

}
