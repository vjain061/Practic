package dataStructure;

class NodeLinkedListCustom {
	int value;
	NodeLinkedListCustom next;

}

public class LinkedListFindMiddleInSinglePass {
	public static void main(String[] args) {
		NodeLinkedListCustom top = prepareLinkedList();
		displayList(top);
		findMiddleElement(top);
		findMiddleElement_InSinglePass(top);
	}

	private static void findMiddleElement_InSinglePass(NodeLinkedListCustom top) {
		NodeLinkedListCustom temp = top;
		
		NodeLinkedListCustom pre = null;
		
		while (top.next != null) {
			pre = temp;
			temp = temp.next;
			
			if(top.next == null)
				break;
			top = top.next;
			if(top.next == null)
				break;
			top = top.next;
		}
		System.out.println("Middle element in single pass : "+pre.value);
	}

	private static void findMiddleElement(NodeLinkedListCustom top) {
		int count = 0;
		NodeLinkedListCustom temp = top;
		while (top.next != null) {
			count++;
			top = top.next;
		}
		if (top.next == null) {
			count++;
		}
		System.out.println("Total number of element : " + count);
		for (int i = 1; i < count / 2; i++) {
			temp = temp.next;
		}
		System.out.println("Middle element : " + temp.value);
	}

	private static void displayList(NodeLinkedListCustom top) {
		while (top.next != null) {
			System.out.print(" " + top.value);
			top = top.next;
		}
		if (top.next == null) {
			System.out.print(" " + top.value);
		}
		System.out.println();
	}

	private static NodeLinkedListCustom prepareLinkedList() {
		NodeLinkedListCustom rootNode = null;

		NodeLinkedListCustom node1 = new NodeLinkedListCustom();
		node1.value = 10;
		node1.next = null;
		rootNode = node1;
		rootNode.next = node1;

		NodeLinkedListCustom node2 = new NodeLinkedListCustom();
		node2.value = 20;
		node2.next = null;
		node1.next = node2;

		NodeLinkedListCustom node3 = new NodeLinkedListCustom();
		node3.value = 30;
		node3.next = null;
		node2.next = node3;

		NodeLinkedListCustom node4 = new NodeLinkedListCustom();
		node4.value = 40;
		node4.next = null;
		node3.next = node4;

		NodeLinkedListCustom node5 = new NodeLinkedListCustom();
		node5.value = 50;
		node5.next = null;
		node4.next = node5;

		NodeLinkedListCustom node6 = new NodeLinkedListCustom();
		node6.value = 60;
		node6.next = null;
		node5.next = node6;

		NodeLinkedListCustom node7 = new NodeLinkedListCustom();
		node7.value = 70;
		node7.next = null;
		node6.next = node7;

		NodeLinkedListCustom node8 = new NodeLinkedListCustom();
		node8.value = 80;
		node8.next = null;
		node7.next = node8;

		NodeLinkedListCustom node9 = new NodeLinkedListCustom();
		node9.value = 90;
		node9.next = null;
		node8.next = node9;

		NodeLinkedListCustom node10 = new NodeLinkedListCustom();
		node10.value = 100;
		node10.next = null;
		node9.next = node10;
		
		NodeLinkedListCustom node11 = new NodeLinkedListCustom();
		node11.value = 110;
		node11.next = null;
		node10.next = node11;
		
		NodeLinkedListCustom node12 = new NodeLinkedListCustom();
		node12.value = 120;
		node12.next = null;
		node11.next = node12;

		return rootNode;
	}
}
