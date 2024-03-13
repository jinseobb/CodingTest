package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import BaekJoon.Q15683_감시.Pair;

public class Practice {
	static int n,m,count,r,c,result;
	static int[][] notebook, sticker;
	
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());
        notebook = new int[n][m];
        for(int i=0; i<count;i++) {
        	st = new StringTokenizer(br.readLine());
        	 r = Integer.parseInt(st.nextToken());
        	c = Integer.parseInt(st.nextToken());
        	sticker = new int[r][c];
        	for(int j=0; j<r; j++) {
        		st = new StringTokenizer(br.readLine());
        		for(int k=0; k<c; k++) {
        			sticker[j][k] = Integer.parseInt(st.nextToken());
        		}
        	}
        	//4방향 
        	for(int rotate = 0; rotate<4; rotate++) {
        		
        		if(attach(sticker)) {
        			break;
        		}
        		sticker = rotate(sticker);
        	}
        
        }
        System.out.println(result);
    }
	private static int[][] rotate(int[][] sticker2) {
		int r = sticker2.length;
		int c = sticker2[0].length;
		int[][] newsticker = new int[c][r];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c;j++) {
				newsticker[j][r-1-i]=sticker2[i][j];
			}
		}
		return newsticker;
	}
	private static boolean attach(int[][] sticker2) {
		for(int i=0; i<n-sticker2.length+1;i++) {
			for(int j=0; j<m-sticker2[0].length+1;j++) {
				if(check(sticker2,i,j)) {
					attachOne(sticker2,i,j);
					return true;
				}
			}
		}
		
		return false;
	}
	private static void attachOne(int[][] sticker2, int row, int col) {

		for(int i=0; i<sticker2.length;i++) {
			for(int j=0; j<sticker2[0].length;j++) {
				if(sticker2[i][j] == 1) {
					notebook[row+i][col+j] = sticker2[i][j];
					result++;
				}
			}
		}
	}
	private static boolean check(int[][] sticker2, int row, int col) {
		for(int i=0; i<sticker2.length;i++) {
			for(int j=0; j<sticker2[0].length;j++) {
				if(sticker2[i][j] == 1 && notebook[row+i][col+j] == 1) {
					return false;
				}
			}
		}
		return true;
	}
    
	

}	
