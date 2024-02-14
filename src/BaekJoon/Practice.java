package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice{
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static boolean[][] visited;
	static int[][]arr;
	static int n,m ,count, area,max;
	static Queue<Point> q;
	static class Point {
		private int x;
		private int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setX(int x){
	    	this.x = x;
	    }
	    
	    public void setY(int y){
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
		q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//start
		count = 0;
		area = 0;
		max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0 || visited[i][j]) {
					continue;
				}
				
				count++;
				q.offer(new Point(i,j));
				visited[i][j] = true;
				area = 0;
				
				
					while(!q.isEmpty()) {
						Point p = q.poll();
						area++;
						for(int k=0; k<4; k++) {
							int nx = p.x + dx[k];
							int ny = p.y + dy[k];
							if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
								continue;
							}
							
							if(arr[nx][ny] == 1 && !visited[nx][ny]) {
								q.offer(new Point(nx,ny));
								visited[nx][ny] = true;
							}
						}
					
					if(area > max) {
						max = area;
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
		
		
	}

}
