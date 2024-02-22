package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice{
	 static int n,k,h,m,count;
	 static int[]arr;
	 static int[] index;
	 static boolean[] visited;
	 static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	 static Queue<Integer> q  = new LinkedList<>();
	 static class Pair{
		 private int x;
		 public Pair(int x) {
			 this.x = x;
		 }
	 }
	 
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		count = 0;
		visited = new boolean[n+1];
		int result = bfs(k);
		System.out.println(result);
		
	}

	private static int bfs(int start) {
		q.offer(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int first = q.poll();
			if(first == h) {
				return arr[first];
			}
			for(int i=0; i<graph.get(first).size();i++) {
				int next = graph.get(first).get(i);
				if(!visited[next]) {
					q.offer(next);
					visited[next] = true;
					arr[next] = arr[first]+1;
				}
			}
		}
		return -1;
	}

	
}


