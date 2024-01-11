package DataStructure;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class Heap {

	static int y; // 자연수 
	static int n; // 자연수 개수 
    static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++ ) {
			y = Integer.parseInt(br.readLine());
			if(y > 0) {
				pq.add(y);
			}else if (y == 0) {
				if(!pq.isEmpty()) {
					sb.append(pq.remove()).append("\n");	
				}else {
					sb.append(0).append("\n");
				}
				
			}
			
		}
   	    	
		System.out.println(sb.toString());   	    
   	    
	}
	
}
