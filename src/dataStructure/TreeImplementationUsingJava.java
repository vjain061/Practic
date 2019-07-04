package dataStructure;

import java.util.Scanner;

public class TreeImplementationUsingJava {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1 for add element");
			System.out.println("0 for exit");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				
				break;
			case 0:
				System.exit(1);

			default:
				break;
			}
		}

	}

	private static void addNode(Node node) {

	}

}

class Node {
	private Node leftNode;
	private int element;
	private Node rightNode;

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

}
