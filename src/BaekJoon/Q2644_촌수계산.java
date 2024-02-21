package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2644_촌수계산 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int n,m ,k,h, x,y,count, depth;
	static boolean[] visited;
	static int[] arr;
	static boolean check;
	static Queue<Integer> q = new LinkedList<>();
	static Queue<Integer> qu = new LinkedList<>();
	static class Pair{
		private int x;
		private int y;
		public Pair(int x , int y) {
			this.x = x;
			this.y = y;
 		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<>());
		}
		//Arrays.fill(arr, -1);
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		count = 0;
		depth = 0;
		visited = new boolean[n+1];
		check = true;
		
		int result = bfs(k);
		System.out.println(result);
		
	
		
	}//main
	private static int bfs(int start) {
		q.offer(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int size = q.poll();
			if(size == h) {
				return arr[size];
			}
			for(int next : graph.get(size)) {
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
					arr[next] = arr[size]+1;
				}
			}
		}
		return -1;
	}
	
}
