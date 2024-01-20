package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=m; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.poll();
			int k = q.poll();

			q.add(k);
			
		}
		
		System.out.println(q.poll());
		
	}//main
}
