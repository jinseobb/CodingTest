package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4179_불 {

	static class Pair{
		private int x;
		private int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static Queue<Pair> myq;
	static Queue<Pair> fireq;
	static char [][] arr;
	static int [][] me;
	static int [][] fire;
	static int n,m,firecount;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		firecount = 1;
		arr = new char[n][m];
		me = new int[n][m];
		fire = new int[n][m];
		myq = new LinkedList<>();
		fireq = new LinkedList<>();
		for(int i=0; i<n; i++) {
			String tmp = br.readLine();
			for(int j=0; j<m; j++) {
				char c = tmp.charAt(j);
				arr[i][j] = c;
				me[i][j] = -1;
				fire[i][j] = -1;
				if(arr[i][j] == 'J') {
					myq.offer(new Pair(i,j));
					me[i][j] = 0;
				}
				if(arr[i][j] == 'F') {
					fireq.offer(new Pair(i,j));
					fire[i][j] = 0;
					
				}
			}
		} // 그래프 채우기 
		
		//불 BFS		
		/*while(!fireq.isEmpty()) {
		    Pair p = fireq.poll();
		    for(int i=0; i<4; i++) {
		        int nx = p.x + dx[i];
		        int ny = p.y + dy[i];
		        if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
		            if(fire[nx][ny] == -1 && arr[nx][ny] != '#') {
		                fireq.offer(new Pair(nx,ny));
		                fire[nx][ny] = fire[p.x][p.y] + 1;
		            }
		        }
		    }
		}*/

		while(!fireq.isEmpty()) {
			Pair p = fireq.poll();
			firecount++;
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if(fire[nx][ny] != -1 || arr[nx][ny]=='#') {
					continue;
				}
				fireq.offer(new Pair(nx,ny));
				fire[nx][ny] = fire[p.x][p.y]+1;
				
			}
		}
		//나 BFS 
		/*while(!myq.isEmpty()) {
		    Pair p = myq.poll();
		    for(int i=0; i<4; i++) {
		        int nx = p.x + dx[i];
		        int ny = p.y + dy[i];
		        if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
		            if(arr[nx][ny] != '#' && me[nx][ny] == -1 && (fire[nx][ny] == -1 || fire[nx][ny] > me[p.x][p.y] + 1)) {
		                myq.offer(new Pair(nx,ny));
		                me[nx][ny] = me[p.x][p.y] + 1;
		            }
		        } else {
		            // 범위를 벗어나는 경우 탈출 성공
		            System.out.println(me[p.x][p.y] + 1);
		            return;
		        }
		    }
		}*/

		//System.out.println(firecount);
		while(!myq.isEmpty()) {
			Pair p = myq.poll();
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
				System.out.println(me[p.x][p.y] + 1);	
					return;
				}
				if(arr[nx][ny] == '#' || me[nx][ny] !=-1 || fire[nx][ny] == 1 || fire[nx][ny] == 0) {
					continue;
				}
				if(firecount == 1) {
					if(fire[nx][ny] != -1 ) {
						continue;
					}
				}else if(firecount ==2) {
					if(fire[nx][ny] != -1) {
						continue;
					}
				}else if(firecount >3)
					if(firecount >3 && fire[nx][ny] == -1) {
						if(fire[nx][ny] != -1) {
							continue;
						}
					}else if (firecount >3 && fire[nx][ny] != -1){
						
						if(fire[nx][ny]<= me[p.x][p.y] +1) {
							continue;
					}
				}
				
				myq.offer(new Pair(nx,ny));
				me[nx][ny] = me[p.x][p.y]+1;
				
			}
				
		}
	
		System.out.println("IMPOSSIBLE");
	}//main
	
	
}
