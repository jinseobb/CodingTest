package DataStructure;

public class LinkedList {

	Node header;
	
	static class Node{

		int data;
		Node next = null;	
	}
	
	
	LinkedList(){
		//this.data = d;
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
	
	public static void main(String[] args) {
		//LinkedList head = new LinkedList(1);
		//LinkedList head2 = new LinkedList(2);
		/*head.append(2);
		head.append(3);
		head.append(4);
		head.append(5);
		head.delete(2);*/
		LinkedList head = new LinkedList();
//	    head.append(1);
//	    head.append(2);
//	    head.append(3);

		head.retrieve();
	}

}
	
		
	

