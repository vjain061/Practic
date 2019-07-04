package collection;

public class LinkedListCustom {
	
	public static void main(String[] args) {

		Node rootNode = new Node();
		rootNode.value = 10;
		rootNode.next = rootNode;
		
		Node n1 = new Node();
		n1.value = 20;
		n1.next = null;
		rootNode.next = n1;
		
		Node n2 = new Node();
		n2.value = 30;
		n2.next = null;
		n1.next = n2;
		
		Node n3 = new Node();
		n3.value = 40;
		n3.next = null;
		n2.next = n3;
		
		Node n4 = new Node();
		n4.value = 50;
		n4.next = null;
		n3.next = n4;
		
		Node n5 = new Node();
		n5.value = 60;
		n5.next = null;
		n4.next = n5;
		
		Node n6 = new Node();
		n6.value = 70;
		n6.next = rootNode; // Making it circular
		n5.next = n6;
		
		//printList(rootNode);
		
		System.out.println("isCycle : "+findCycle(rootNode));
	}
	
	private static boolean findCycle(Node rootNode) {
		
		Node slow_ = rootNode;
		Node fast_ = rootNode;
		
		boolean isFirstIteration = true;
		boolean isCycle = false;
		
		while(true) {
			if(isFirstIteration) {
				slow_ = slow_.next;
				fast_ = fast_.next;
				fast_ = fast_.next;
				isFirstIteration = false;
			}
			if(slow_ == fast_) {
				isCycle = true;
				break;
			}else {
				if(slow_.next == null) {
					break;
				}
				slow_ = slow_.next;
				if(fast_.next == null) {
					break;
				}
				fast_ = fast_.next;
				if(fast_.next == null) {
					break;
				}
				fast_ = fast_.next;
			}
		}
		
		return isCycle;
		
		
	}

	public static void printList(Node rootNode) {
		while(rootNode.next != null) {
			System.out.println(rootNode.value);
			rootNode = rootNode.next;
		}
		if(rootNode.next == null) {
			System.out.println(rootNode.value);
		}
	}
	
}

class Node{
	int value;
	Node next;
}
