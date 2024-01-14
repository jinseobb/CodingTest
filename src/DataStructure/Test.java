package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Test {

 static int n;
 static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
 
 public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	n = Integer.parseInt(st.nextToken());
	
	for(int i=0; i<n; i++) {
	  st = new StringTokenizer(br.readLine());
	  while(st.hasMoreTokens()) {
			pq.add(Integer.parseInt(st.nextToken()));
	  }
		
		
	}
	
	
	for(int i=1; i<n; i++) {
		pq.remove();
	}
	
	System.out.println(pq.peek());
}

	
	
}
