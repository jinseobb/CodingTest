package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697_숨바꼭질 {

	static int n,k,count;
	static boolean[] visited;
	static Queue<Pair> q;
	static class Pair{
		private int x;
		public Pair(int x) {
			this.x = x;
		}	
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new boolean[100001];
		q = new LinkedList<>();
		count = 0;
		if(n == k) {
			System.out.println(0);
			return;
		}
		q.offer(new Pair(n));
		while(true) {
			count++;
			int size = q.size();
			for(int i=0; i<size; i++) {
				Pair p = q.poll();
				visited[p.x] = true;
				if(p.x+1 == k || p.x-1 == k || p.x * 2 ==k ) {
					System.out.println(count);
					return;
				}
				if(p.x-1 >= 0 && !visited[p.x-1]) {
					q.offer(new Pair(p.x-1));
					visited[p.x-1] = true;
				}
				if(p.x+1 <= 100000 && !visited[p.x+1]) {
					q.offer(new Pair(p.x+1));
					visited[p.x+1] = true;
				}
				if(p.x * 2 <= 100000 && !visited[p.x * 2]) {
					q.offer(new Pair(p.x*2));
					visited[p.x*2] = true;
				}
				
			}
		}
	
	
	}
	
}
