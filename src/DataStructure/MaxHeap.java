package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

	static int n;
	static int y;
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sr = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
		y = Integer.parseInt(br.readLine());
		  if(y>0) {
			  pq.add(y);
		  }else if (y == 0 ) {
			  if(!pq.isEmpty()) {
				  sr.append(pq.remove()).append("\n");
			  }else {
				  sr.append(0).append("\n");
			  }
		  }
		}
		System.out.println(sr.toString());
	}
}
