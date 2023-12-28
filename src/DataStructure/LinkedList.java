package DataStructure;

public class LinkedList {

		int data;
		LinkedList next = null;
	
	
	LinkedList(int d){
		this.data = d;
	}

	void append(int d) {
		LinkedList end = new LinkedList(d);
		LinkedList n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		LinkedList n = this;
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}else {
			n = n.next;
			}
		}
	}
	
	void retrieve() {
		LinkedList n = this;
		while(n.next != null) {
			System.out.print(n.data + " -> ");
		 n = n.next;
		}
		System.out.print(n.data);
	}
	
	public static void main(String[] args) {
		LinkedList head = new LinkedList(1);
		LinkedList head2 = new LinkedList(2);
		/*head.append(2);
		head.append(3);
		head.append(4);
		head.append(5);
		head.delete(2);*/
	head.next = head2;
		head.retrieve();
	}

}
	
		
	

