package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice {
	static int N,M,r,c,d,count,nextDirection;
	static int[][] arr;
	static boolean[][] cleaned;	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static Queue<Pair> q;
 	static class Pair{
 		private int x;
 		private int y;
 		private int direction;
 		
 		public Pair(int x, int y, int direction) {
 			this.x = x;
 			this.y = y;
 			this.direction = direction;
 		}
 		
 	}
 	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		cleaned = new boolean[N][M];
		q = new LinkedList<Pair>();
		
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c =Integer.parseInt(st.nextToken());
		d =Integer.parseInt(st.nextToken());
		
		//d = 북동남서 
		//0 이면 청소x 1 이면 벽  
		
		//map 채우
		for(int i=0; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M;j++) {
				int ch = Integer.parseInt(st.nextToken());
				arr[i][j] = ch;
			}
		}
		
		
		q.offer(new Pair(r,c,d));
		cleaned[r][c] = true;
		count = 1;
		BFS();
		
	}

	private static void BFS() {
		while(!q.isEmpty()) {
			Pair p = q.poll();
			nextDirection = p.direction;
			boolean moved = false;
			//1. 청소되지 않은 경우 청소 하기 
			if(arr[p.x][p.y] == 0) {
				arr[p.x][p.y] = 2;
			}
			
			//2. 왼쪽 방향으로 회전 
			for(int i=0; i<4; i++) {
				nextDirection  = (nextDirection+3) % 4;
				int nx = p.x+dx[nextDirection];
				int ny = p.y+dy[nextDirection];
				if(nx < 0 || ny < 0 || nx >= N|| ny >= M) {
					continue;
				}
				if(arr[nx][ny] == 0 && !cleaned[nx][ny]) {
					cleaned[nx][ny] = true;
					q.offer(new Pair(nx,ny,nextDirection));
					count++;
					moved = true;
					break;
				}
				
			}
			if(!moved) {
				nextDirection = (nextDirection+2)%4;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
