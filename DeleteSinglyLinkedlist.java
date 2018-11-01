package ex;

public class DeleteSinglyLinkedlist {

	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);

		a.next = b;
		b.next = c;

		deleteNode(b);
		
		LinkedListNode head = a;
		while ( head != null ){
			System.out.print(head.value);
			head = head.next;
		}
		

	}
	public static void deleteNode(LinkedListNode head){
		LinkedListNode nextNode = head.next;
		head.value = nextNode.value;
		head.next = nextNode.next;
	}
}
class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}