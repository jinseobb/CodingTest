package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738 {
	static int n;
	static int m;

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)
				);
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[][] ss = new int[n][m];
		for(int i=0; i<n; i++) {
		 st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				
			   ss[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
	st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				sb.append(ss[i][j] + Integer.parseInt(st.nextToken())).append(" ");
			}
			sb.append("\n");
		}
		
		
	  
		System.out.println(sb);
}
}