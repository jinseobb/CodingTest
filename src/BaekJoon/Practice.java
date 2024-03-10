package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import BaekJoon.Q15683_감시.Pair;

public class Practice {
	static int n,m;
	static class Pair{
		private int x;
		private int y;
		private int cctvnum;
		 
		 public Pair(int x, int y, int cctvnum) {
			 this.x = x;
			 this.y = y;
			 this.cctvnum = cctvnum;
		 }
	}
	static int[][] arr;
	static ArrayList<Pair> cctv = new ArrayList<>();
	static int min = Integer.MAX_VALUE;
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<m; j++) {
        		
        		int a = Integer.parseInt(st.nextToken());
        		arr[i][j] = a;
        		if(a !=0 && a != 6 ) {
        			cctv.add(new Pair(i,j,arr[i][j]));
        		}
        	}
        }
        BT(0,arr,cctv);
        System.out.println(min);
    }
    private static void BT(int depth, int[][] arr2, ArrayList<Pair> cctv2) {
		if(depth == cctv2.size()) {
			min = Math.min(min, getCount(arr2));
			return;
		}
		int cctvNum = cctv.get(depth).cctvnum;
		int x = cctv.get(depth).x;
		int y = cctv.get(depth).y;
		int[][] tmp;
		if(cctvNum == 1) {
			tmp = copy(arr2);
			checkLeft(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkRight(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkUp(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkDown(tmp,x,y);
			BT(depth+1,tmp,cctv);
		}else if(cctvNum ==2 ) {
			tmp = copy(arr2);
			checkLeft(tmp,x,y);
			checkRight(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkUp(tmp,x,y);
			checkDown(tmp,x,y);
			BT(depth+1,tmp,cctv);
		}else if(cctvNum ==3 ) {
			tmp = copy(arr2);
			checkUp(tmp,x,y);
			checkRight(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkRight(tmp,x,y);
			checkDown(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkDown(tmp,x,y);
			checkLeft(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
			tmp = copy(arr2);
			checkLeft(tmp,x,y);
			checkUp(tmp,x,y);
			BT(depth+1,tmp,cctv);
			
		}else if(cctvNum ==4 ) {
			tmp = copy(arr2);
            checkLeft(tmp, x, y);
            checkUp(tmp, x, y);
            checkRight(tmp, x, y);
            BT(depth+1, tmp, cctv);

            tmp = copy(arr2);
            checkUp(tmp, x, y);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            BT(depth+1, tmp, cctv);

            tmp = copy(arr2);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            BT(depth+1, tmp, cctv);

            tmp = copy(arr2);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            checkUp(tmp, x, y);
            BT(depth+1, tmp, cctv);
		}else if(cctvNum ==5 ) {
			tmp = copy(arr2);
			checkRight(tmp,x,y);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            checkUp(tmp, x, y);
            BT(depth+1, tmp, cctv);
		}
		
	}
	private static int getCount(int[][] arr3) {
		int  count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr3[i][j] == 0) {
					count++;
				}
			}
		}
	
		return count;
	}
	private static void checkUp(int[][] tmp, int x, int y) {
		for(int i=x-1; i>=0; i--) {
			if(tmp[i][y] == 6) {
				return;
			}
			if(tmp[i][y] != 0) {
				continue;
			}
			tmp[i][y] = -1;
		}
		
	}
	private static void checkLeft(int[][] tmp, int x, int y) {

		for(int i=y-1; i>=0; i--) {
			if(tmp[x][i] == 6) {
				return;
			}
			if(tmp[x][i] != 0) {
				continue;
			}
			tmp[x][i] = -1;
		}
	}
	private static void checkDown(int[][] tmp, int x, int y) {

		for(int i=x+1; i<n; i++) {
			if(tmp[i][y] == 6) {
				return;
			}
			if(tmp[i][y] != 0) {
				continue;
			}
			tmp[i][y] = -1;
		}
	}
	private static void checkRight(int[][] tmp, int x, int y) {

		for(int i=y+1; i<m; i++) {
			if(tmp[x][i] == 6) {
				return;
			}
			if(tmp[x][i] != 0) {
				continue;
			}
			tmp[x][i] = -1;
		}
	}
	private static int[][] copy(int[][] arr3) {
		int[][] ttt = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m;j++) {
				ttt[i][j] = arr3[i][j];
			}
		}
		return ttt;
	}
	

}	
