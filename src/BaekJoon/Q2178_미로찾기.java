package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178_미로찾기 {
	static int n,m, count, max;
	static int[][] arr;
	static boolean[][] visited;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static Queue<Pair> q;
	static class Pair {
		private int x;
		private int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
			
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
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String tmp = br.readLine();
			for(int j=0; j<m; j++) {
				String c = tmp.substring(j, j+1);
				arr[i][j] = Integer.parseInt(c);
			}
		}
		
		//start
		count = 0;
		max = 0;
		q = new LinkedList<>();
		
		BFS(0,0);
				
		 System.out.println(arr[n - 1][m - 1]);	
		
	}

	private static void BFS(int i, int j) {
		q.offer(new Pair(i,j));
		visited[i][j] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			visited[i][j] = true;
			for(int k=0; k<4; k++) {
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if(arr[nx][ny] == 1 && !visited[nx][ny]) {
					visited[nx][ny] = true;
					q.offer(new Pair(nx,ny));
					arr[nx][ny] = arr[p.getX()][p.getY()] + 1;
				}
			}
		}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
