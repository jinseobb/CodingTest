package DataStructure;

public class LinkedList {

	Node header;
	
	
	static class Node{
		int data;
		Node next = null;
	}
	
	
	
	LinkedList(){
		header = new Node();
	}

	void append(int d) {
		Node end = new Node();
		
		end.data = d;
		Node n = header;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;

	}
	
	void delete(int d) {
		Node n = header;
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}else {
			n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = header;
		while(n.next != null) {
			System.out.print(n.data + " -> ");
		 n = n.next;
		}
		System.out.print(n.data);
	}
	
	void removeDups() {
		Node n = header;
		while(n != null && n.next != null) {
			Node r = n;
			while(r.next != null) {
				if(n.data == r.next.data) {
					r.next = r.next.next;
				}else {
					r = r.next;
				}
			}
			n = n.next;
		}
	}

	Node getFirst() {
		Node n = header;
		return header;
	}
	
	
	
	public static void main(String[] args) {
//		LinkedList head = new LinkedList(1);
//		LinkedList head2 = new LinkedList(2);
		/*head.append(2);
		head.append(3);
		head.append(4);
		head.append(5);
		head.delete(2);*/
	//head.next = head2;
	//	head.retrieve();
		
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.retrieve();
	//	System.out.println();
    //  ll.removeDups();
	//	ll.retrieve();
		
	System.out.println();
	
		int k = 2;
		kthToLast(ll.getFirst(),k);
	}

	private static int kthToLast(Node first, int k) {
		if(first== null) {
			return 0;
		}
		
		int count = kthToLast(first.next, k) + 1;
		if(count == k) {
			System.out.println(k + "번째 노드는 " + first.data); 
		}
		return count;
	}

}
	
		
	

