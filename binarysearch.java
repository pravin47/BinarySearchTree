package com.binary.search;

public class BinarySearchTree<E extends Comparable<E>> {

	E key;
	public BinaryNode leftNode;
	public BinaryNode rightNode;

	public BinaryNode(E key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}

	public int size() {
		if (this.key == null) {
			return 0;
		} else {
			return (1 + this.leftNode.size() + this.rightNode.size());
		}
	}
}

public class BinaryNode<E extends Comparable<E>> {
	public static void main(String args[]) {

	private BinaryNode<E> root;

	private BinaryNode<E> root;

	public BinarySearchTree(){
			this.root = null;	
		}

	public void add(E data) {
		this.root = this.addNode(root, data);
	}

	private BinaryNode<E> addNode(BinaryNode<E> current, E data) {

		if (current == null) {
			return new BinaryNode<E>(data);
		}

		else if (current.key.compareTo(data) > 0) {
			current.leftNode = addNode(current.leftNode, data);
		}

		else {
			current.rightNode = addNode(current.rightNode, data);
		}
		return current;
	}

	public int size() {
		return this.getSize(root);
	}

	public int getSize(BinaryNode<E> current) {
		return current == null ? 0 : 1 + this.getSize(current.leftNode) + this.getSize(current.rightNode);
	}

	public boolean search(E data) {
		return searchNode(this.root, data);
	}

	public boolean searchNode(BinaryNode<E> current, E data) {

		if (current == null) {
			return false;
		}

		else if (current.key == data) {
			return true;
		}

		else if (current.key.compareTo(data) > 0) {
			return this.searchNode(current.leftNode, data);
		}

		else {
			return this.searchNode(current.rightNode, data);
		}
	}
}
