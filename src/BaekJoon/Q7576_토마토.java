package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q7576_토마토 {
	static int n,m, count, max, finalcount;
	static int[][] arr;
	static boolean[][] visited;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static Queue<Pair> q;
	static class Pair {
		private int x;
		private int y;
		private int day;
		public Pair(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day=day;
			
		}
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n= Integer.parseInt(st.nextToken());
		count = 0;
		finalcount = 0;
		arr =  new int[n][m];
		visited = new boolean[n][m];
	q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ;j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					q.offer(new Pair(i,j,0));
					visited[i][j]= true;
				}else if(arr[i][j] == 0) {
					count++;
				}
			}
		}
		
		bfs();
		if(count == 0) {
			System.out.println(finalcount);
		}else {
			System.out.println(-1);
		}
		
		
		
	}

	private static void bfs() {
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int k=0; k<4; k++) {
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx >=0 && ny>=0 && nx < n && ny < m) {
					if(arr[nx][ny] == 0 && !visited[nx][ny]) {
						q.offer(new Pair(nx,ny,p.day+1));
						visited[nx][ny] = true;
						finalcount = p.day+1;
						count--;
						
					}
			}
		}
		
		
	}
	}
	
	
	
	
	
	
	
}
