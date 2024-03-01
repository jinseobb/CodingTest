package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q5427_불2 {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] me;
	static int[][] fire;
	static char[][] arr;
	static int T,width,height,result;
	static Queue<Pair> myq;
	static Queue<Pair> fireq;
	static StringBuilder sb = new StringBuilder();
	static class Pair{
		private int x;
		private int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		myq = new LinkedList<>();
		fireq = new LinkedList<>();
		for(int i=0; i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			arr = new char [height][width];
			fire = new int [height][width];
			me = new int [height][width];
			for(int j=0; j<height; j++) {
				String tmp = br.readLine();
				for(int k=0; k<width; k++) {
					char c = tmp.charAt(k);
					arr[j][k] = c;	
					me[j][k] = -1;
					fire[j][k] = -1;
					if(arr[j][k] == '@') {
						myq.offer(new Pair(j,k));
						me[j][k] = 0;
					
					}
					if(arr[j][k]=='*') {
						fireq.offer(new Pair(j,k));
						fire[j][k] = 0;
					}
				} // for k
			}// for j
		result=bfs();
		if (result == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(result);
        }
      
		} //for i
	}// main
	private static int bfs() {


		//	불bfs 
			while(!fireq.isEmpty()) {
				Pair p = fireq.poll();
				for(int i=0; i<4; i++) {
					int nx = p.x+dx[i];
					int ny = p.y+dy[i];
					if(nx < 0 || ny < 0 || nx >= height || ny >= width) {
						continue;
					}
					if(fire[nx][ny] != -1 || arr[nx][ny]=='#') {
						continue;
					}
					fireq.offer(new Pair(nx,ny));
					fire[nx][ny] = fire[p.x][p.y]+1;
					

				}
			}
		//상근
			while(!myq.isEmpty()) {
				Pair p = myq.poll();
				for(int i=0; i<4; i++) {
					int nx = p.x+dx[i];
					int ny = p.y+dy[i];
					
					if(nx >= 0 && ny >= 0 && nx < height && ny < width) {


			            if(arr[nx][ny] != '#' && me[nx][ny] == -1 && (fire[nx][ny] == -1 || fire[nx][ny] > me[p.x][p.y] + 1)) {
			                myq.offer(new Pair(nx,ny));
			                me[nx][ny] = me[p.x][p.y] + 1;
			            }
			        } else {
			            // 범위를 벗어나는 경우 탈출 성공
			            
			          return me[p.x][p.y]+1;
			        }
					
				}
			}
		return -1;
	}
	
	
}
