package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206_벽부수고이동하기 {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static Queue<Pair> q ;
	static class Pair{
		private int x;
		private int y;
		private int dist;
		private boolean des;
		public Pair(int x, int y, int dist, boolean des) {
			this.x = x;
			this.y = y;
			this.dist = dist;
			this.des = des;
		
		}
	}
	static int height,width,count;
	static int[][] arr;
	static boolean[][][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    q = new LinkedList<>();
		height = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		arr = new int[height][width];
		check = new boolean[2][height][width];
		for(int i=0;i<height;i++) {
			String tmp = br.readLine();
			for(int j=0;j<width;j++) {
				int a = tmp.charAt(j) - '0';
				arr[i][j] = a;
			}
		}//채우기 
		count = 1;
		int result = bfs();
	
		if(result == -1) {
			System.out.println(result);
		}else {
			System.out.println(result);
		}
	}
	private static int bfs() {
		q.offer(new Pair(0,0,0,false));
		check[0][0][0] = true;
		while(!q.isEmpty()) {
			Pair p = q.poll();
			if(p.x == height-1 && p.y == width-1) {
				return p.dist+1;
			}
			for(int i=0; i<4; i++) {
				int nx = p.x+dx[i];
				int ny = p.y+dy[i];
				if(nx < 0 || ny < 0 | nx >= height || ny >= width) {
					continue;
				}
				if(p.des) {
					if(arr[nx][ny] == 0 && !check[1][nx][ny]) {
						q.offer(new Pair(nx,ny,p.dist+1,true));
						check[1][nx][ny] = true;
					}else {
						continue;
					}
				}else {
					if(arr[nx][ny] == 0 && !check[0][nx][ny]) {
						q.offer(new Pair(nx,ny,p.dist+1,false));
						check[0][nx][ny] =true;
					}else if (arr[nx][ny] == 1) {
						q.offer(new Pair(nx,ny,p.dist+1,true));
						check[1][nx][ny] =true;
					}
				}
				
			}
			
		}
		return -1;
		
	}
}
