package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260_DFS와BFS {
	static int[][] arr;
	static boolean[] visited;
	static int n;
	static int m;
	static int k;
	static Queue<Integer> q;
	static StringBuilder sb;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		q = new LinkedList<>();
		
		sb = new StringBuilder();
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//arr[a][b] = arr[b][a] = 1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
	
		for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i)); // 작은 원소부터 방문하도록 정렬
        }
		visited = new boolean[n+1];
		dfs(k);
		sb.append("\n");
		visited = new boolean[n+1];
		bfs(k);
		System.out.println(sb);
	}//main

	private static void dfs(int start) {
		visited[start] = true;
		sb.append(start+ " ");
		
		for(int i=0; i<graph.get(start).size(); i++) {
			int next = graph.get(start).get(i);
			if(!visited[next]) {
				dfs(next);
			}
		}
		
	}

	private static void bfs(int start) {
		q.offer(start);
		visited[start] = true;

		while(!q.isEmpty()	) {
			start = q.poll();
			sb.append(start + " ");
			
			for(int i=0; i<graph.get(start).size(); i++) {
				int next = graph.get(start).get(i);
				if(!visited[next]) {
					q.offer(next);
					visited[next] = true;
				}
			}
		}
	}
	
}
