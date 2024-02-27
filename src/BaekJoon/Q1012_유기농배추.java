package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1012_유기농배추 {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] arr;
	static boolean[][] visited;
	static int T,n,m,k, count = 0;
	static Queue<Pair> q = new LinkedList<>();
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
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			 m= Integer.parseInt(st.nextToken());
			 n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int [n][m];
			visited = new boolean[n][m];
			count = 0;
			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[b][a] = 1;
				//q.offer(new Pair(b,a));
				//visited[b][a] = true;
				
			}
			for(int k=0; k<n;k++) {
				for(int d=0; d<m; d++) {
					if(!visited[k][d] && arr[k][d] == 1) {
						count++;
						bfs(k,d);
					//	q.offer(new Pair(d,k));
					//	visited[d][k] = true;
					}
				}
			}
			sb.append(count).append("\n");
			//System.out.println(count);
		}
		
	System.out.println(sb);
		
	}

	private static void bfs(int row, int column) {
		
		q.offer(new Pair(column,row));
		visited[row][column]=true;
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int i=0; i<4; i++) {
				int nx = p.x +dx[i];
				int ny = p.y+ dy[i];
				if(nx < 0 || ny < 0 || nx >= m || ny >= n) {
					continue;
				}
				if(!visited[ny][nx] && arr[ny][nx] == 1) {
					q.offer(new Pair(nx,ny));
					visited[ny][nx] = true;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
