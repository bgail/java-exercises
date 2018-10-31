package ex;

public class KToLastNode {

	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode("Angel Food");
		LinkedListNode b = new LinkedListNode("Bundt");
		LinkedListNode c = new LinkedListNode("Cheese");
		LinkedListNode d = new LinkedListNode("Devil's Food");
		LinkedListNode e = new LinkedListNode("Eccles");

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		System.out.println(kthToLastNode(3, a));
		System.out.println(kthToLastNodeStick(5, a));

	}
	public static String kthToLastNode(int k, LinkedListNode head){
		if (k < 1) {
	        throw new IllegalArgumentException("Impossible to find less than first to last node: " + k);
	    }
		int size = 0;
		LinkedListNode tmp = head;
		while(tmp.next != null){
			size++;
			tmp = tmp.next;
		}
		if (k > size) {
	        throw new IllegalArgumentException("k is larger than the length of the linked list: " + k);
	    }
		int i = 0;
		while(head.next != null && i++ < size-k+1){
			head = head.next;
		}
		return head.value;
	}
	
	
	public static String kthToLastNodeStick(int k, LinkedListNode head){
		if (k < 1) {
	        throw new IllegalArgumentException(
	            "Impossible to find less than first to last node: " + k);
	    }
	    LinkedListNode leftNode  = head;
	    LinkedListNode rightNode = head;

	    // move rightNode to the kth node
	    for (int i = 0; i < k - 1; i++) {
	        if (rightNode.next == null) {
	            throw new IllegalArgumentException(
	                "k is larger than the length of the linked list: " + k);
	        }

	        rightNode = rightNode.next;
	    }

	    while (rightNode.next != null) {
	        leftNode  = leftNode.next;
	        rightNode = rightNode.next;
	    }

	    return leftNode.value;
	}

}
class LinkedListNode {

    public String value;
    public LinkedListNode next;

    public LinkedListNode(String value) {
        this.value = value;
    }
}

