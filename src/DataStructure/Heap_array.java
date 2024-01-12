package DataStructure;

import java.util.ArrayList;

class Heap_array {

	ArrayList<Integer> heap;
	
	public Heap_array() {
		heap = new ArrayList<Integer>();
		heap.add(0);
	}
	public void insert(int val) {
		heap.add(val);
		
		int p = heap.size()-1;
		
		//루트까지 교환
		while(p>1 && heap.get(p/2) > heap.get(p)) {
			
			int tmp = heap.get(p/2); //부모노드의값
			
			heap.set(p/2, val);
			heap.set(p, tmp);
			
			p = p/2;
		} //while
		
	} // insert
	
	public static void main(String[] args) {
		Heap_array h = new Heap_array();
		h.insert(2);
		h.insert(1);
	
		System.out.println(h.heap);
	}
}
