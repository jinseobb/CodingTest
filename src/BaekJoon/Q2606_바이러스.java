package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606_바이러스 {
		
	static int n,m,count;
	static Queue<Pair> q;
	static int[] arr;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();
	static class Pair{
		private int x;
		
		public Pair(int x) {
			this.x = x;
		
		}
	}
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			m = Integer.parseInt(br.readLine());
			
			arr = new int[n+1];
			q = new LinkedList<>();
			
			
			for(int i=0; i<=n; i++) {
				graph.add(new ArrayList<>());
				
			}
			
			for(int i=0; i<m; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				graph.get(a).add(b);
				graph.get(b).add(a);
				
			}
			visited = new boolean[n+1];
			count = 0;
			q.offer(new Pair(1));
			visited[1] = true;
			
			while(!q.isEmpty()) {
				Pair p = q.poll();
				for(int i=0; i<graph.get(p.x).size(); i++) {
					int next = graph.get(p.x).get(i);
					if(!visited[next]) {
						q.offer(new Pair(next));
						visited[next] = true;
						count++;
					}
				}
				
			}
			
			System.out.println(count);
			
			
		}
		
}
