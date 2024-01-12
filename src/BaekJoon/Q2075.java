package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2075 {

	static int n;
	static String s1;
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 n = Integer.parseInt(br.readLine());
		 
		
		
		 
		 for(int i=0; i<n; i++) {
			 s1 = br.readLine();
			StringTokenizer st = new StringTokenizer(s1);
			
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
