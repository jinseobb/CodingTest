package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS_음료수얼려먹기 {

	static int n,m,count;
	static int[][] arr;
	static boolean[][] visited;
	static Queue<Pair> q = new LinkedList<>();
	static class Pair{
		private int x;
		private int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String tmp = br.readLine();
			for(int j=0; j<m; j++) {
				char c = tmp.charAt(j);
				arr[i][j] = c-'0';
			}
		}
		count = 0;
		//bfs 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0 && !visited[i][j]) {
					q.offer(new Pair(i,j));
					visited[i][j] = true;
					bfs(i,j);
					count++;
				}
			}
		}
		System.out.println(count);
	}//main

	private static void bfs(int i, int j) {
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int k=0; k<4; k++) {
				int nx = p.x+dx[k];
				int ny = p.y+dy[k];
				if(nx <0 || ny < 0 || nx >=n || ny >= m) {
					continue;
				}
				if(arr[nx][ny] == 0 && !visited[nx][ny]) {
					q.offer(new Pair(nx,ny));
					visited[nx][ny] = true;
					
				}
			}
		}
			
		
	}
	










}











