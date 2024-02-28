package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562_나이트의이동 {
	static int[] dx = {1,2,2,1,-1,-2,-2,-1};
	static int[] dy = {2,1,-1,-2,-2,-1,1,2};
	static int[][] arr;
	static boolean[][] visited;
	static Queue<Pair> q = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	static class Pair{
		private int x;
		private int y;
		private int day;
		public Pair(int x, int y , int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	static int n,i,size = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			size = Integer.parseInt(br.readLine());
			arr = new int[size][size];
			visited = new boolean[size][size];
			
			String now = br.readLine();
			int n1 = Integer.parseInt(now.split(" ")[0]);
			int n2= Integer.parseInt(now.split(" ")[1]);
			//q.offer(new Pair(n1,n2));
			
			String target = br.readLine();
			int t1 = Integer.parseInt(target.split(" ")[0]);
			int t2= Integer.parseInt(target.split(" ")[1]);
		bfs(n1,n2,t1,t2);
		//	System.out.println(count);
		//	count=0;
		//sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
	private static void bfs(int n1, int n2, int t1, int t2) {
		q.offer(new Pair(n1,n2,0));
		visited[n1][n2] = true;
		while(!q.isEmpty()) {
			Pair p = q.poll();
			if(p.x == t1 && p.y == t2) {
				sb.append(p.day).append("\n");
			}
			for(int i=0; i<8; i++) {
				int nx = p.x+dx[i];
				int ny = p.y+dy[i];
				if(nx < 0 || ny < 0 || nx >= size|| ny >= size) {
					continue;
				}
				
				if(!visited[nx][ny] ) {
					q.offer(new Pair(nx,ny,p.day+1));
					visited[nx][ny] = true;
				//	count++;
				}
			}
		}
	//	System.out.println();
	//return -1;
	}
 }
