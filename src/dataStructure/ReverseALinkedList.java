package dataStructure;

class NodeReverseALinkedList {
	int value;
	NodeReverseALinkedList next;

}

public class ReverseALinkedList {

	public static void main(String[] args) {
		NodeReverseALinkedList top = prepareLinkedList();
		//displayList(top);
		//NodeReverseALinkedList result = reverseList(top);
		//displayList(result);
		
		amdocs(top,2);
		
	}
	
	public static void amdocs(NodeReverseALinkedList top,int n){
		displayList(top);
		
		NodeReverseALinkedList tempResult = new NodeReverseALinkedList();
		NodeReverseALinkedList last = top;
		NodeReverseALinkedList beforeLast = top;

		int count = 1;
		while (last.next != null) {
			last = last.next;
			count++;
		}
		for(int i=0;i<count-2;i++){
			beforeLast = beforeLast.next;
		}
		
		System.out.println("last : "+last.value);
		System.out.println("beforeLast : "+beforeLast.value);
		System.out.println("count : "+count);
		
		
		tempResult = beforeLast;

		displayList(tempResult);
		
	}
	
	
	

	private static NodeReverseALinkedList reverseList(NodeReverseALinkedList head) {
		NodeReverseALinkedList pointer = head;
		NodeReverseALinkedList previous = null, current = null;

		    while (pointer != null) {
		      current = pointer;
		      pointer = pointer.next;

		      // reverse the link
		      current.next = previous;
		      previous = current;
		      head = current;
		    }
		return head;
	}

	private static void displayList(NodeReverseALinkedList top) {
		while (top.next != null) {
			System.out.print(" " + top.value);
			top = top.next;
		}
		if (top.next == null) {
			System.out.print(" " + top.value);
		}
		System.out.println();
	}

	private static NodeReverseALinkedList prepareLinkedList() {
		NodeReverseALinkedList rootNode = null;

		NodeReverseALinkedList node1 = new NodeReverseALinkedList();
		node1.value = 10;
		node1.next = null;
		rootNode = node1;
		rootNode.next = node1;

		NodeReverseALinkedList node2 = new NodeReverseALinkedList();
		node2.value = 20;
		node2.next = null;
		node1.next = node2;

		NodeReverseALinkedList node3 = new NodeReverseALinkedList();
		node3.value = 30;
		node3.next = null;
		node2.next = node3;

		NodeReverseALinkedList node4 = new NodeReverseALinkedList();
		node4.value = 40;
		node4.next = null;
		node3.next = node4;

		NodeReverseALinkedList node5 = new NodeReverseALinkedList();
		node5.value = 50;
		node5.next = null;
		node4.next = node5;

		NodeReverseALinkedList node6 = new NodeReverseALinkedList();
		node6.value = 60;
		node6.next = null;
		node5.next = node6;

		NodeReverseALinkedList node7 = new NodeReverseALinkedList();
		node7.value = 70;
		node7.next = null;
		node6.next = node7;

		NodeReverseALinkedList node8 = new NodeReverseALinkedList();
		node8.value = 80;
		node8.next = null;
		node7.next = node8;

		NodeReverseALinkedList node9 = new NodeReverseALinkedList();
		node9.value = 90;
		node9.next = null;
		node8.next = node9;

		NodeReverseALinkedList node10 = new NodeReverseALinkedList();
		node10.value = 100;
		node10.next = null;
		node9.next = node10;

		NodeReverseALinkedList node11 = new NodeReverseALinkedList();
		node11.value = 110;
		node11.next = null;
		node10.next = node11;

		NodeReverseALinkedList node12 = new NodeReverseALinkedList();
		node12.value = 120;
		node12.next = null;
		node11.next = node12;

		return rootNode;
	}
}
