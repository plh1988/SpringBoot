package com.pradeep.trees;

public class DocumentTree {
	
	private Node root;
	
	public void traverseTree(Node node) {
		if(node!= null && node.getChildrenNodes()!= null) {
			for(Node n:node.getChildrenNodes()) {
				traverseTree(n);
			}
		}else {
			System.out.println(node.toString());
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void readTree() {
		if(root!=null) {
			traverseTree(this.root);
		}
	}

}
