package com.pradeep.trees;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int id;
	private String name;
	private List<Node> childrenNodes;
	
	public Node(int id,String name) {
		this.id=id;
		this.name=name;
		this.childrenNodes=null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Node> getChildrenNodes() {
		return childrenNodes;
	}

	public void setChildrenNodes(List<Node> childrenNodes) {
		this.childrenNodes = childrenNodes;
	}
	
	public void addChildNode(Node node) {
		if(this.childrenNodes == null) {
			childrenNodes = new ArrayList<Node>();
			childrenNodes.add(node);
		}else {
			childrenNodes.add(node);
		}
	}

	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
	public Node getChildNode(int id) {
		for(Node n:this.childrenNodes) {
			if(n.id ==id) {
				return n;
			}
		}
		return null;
	}
	
}
