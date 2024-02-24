package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice {
	static int[] dx = {1,0,-1,0,0,0};
	static int[] dy = {0,1,0,-1,0,0};
	static int[] dz = {0,0,0,0,1,-1};
	static int n,m,h,count,finalcount= 0;
	static Queue<Pair> q = new LinkedList<>();
	static int[][][] arr;
	static boolean[][][] visited;
	static class Pair{
		private int x;
		private int y;
		private int z;
		private int day;
		public Pair(int x, int y, int z , int day) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.day = day;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		arr= new int[h][n][m];
		visited = new boolean [h][n][m];
		for(int i=0; i<h; i++) {
			for(int j=0;j<n;j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0; k<m; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k]==0) {
						count++;
					}
					if(arr[i][j][k] == 1) {
						q.offer(new Pair(j,k,i,0));
						visited[i][j][k] = true;
					}
				}
			}
		}
		
		//bfs
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int i=0; i<6; i++) {
				int nx = p.x+dx[i];
				int ny = p.y+dy[i];
				int nz = p.z+dz[i];
				if(nx < 0 || ny < 0 || nz < 0 || nx >=n || ny >=m || nz>=h){
					continue;
				}
				if(!visited[nz][nx][ny] && arr[nz][nx][ny] == 0) {
					q.offer(new Pair(nx,ny,nz,p.day+1));
					visited[nz][nx][ny] = true;
					finalcount = p.day+1;
					count--;
							
				}
			}
		}
		
		if(count ==0) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}
		
	}
}	
