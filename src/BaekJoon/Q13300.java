package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q13300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
	    int[][] student = new int[7][2];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
				student[y][s]++;
			
		}
		int count= 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<2; j++) {
				if(student[i][j] == 0) {
					continue;
				}else {
					if(student[i][j] % k == 0) {
					count += student[i][j] / k;	
					}else {
						count += student[i][j] / k + 1;
					}
				}
			}
			
		}
		System.out.println(count);
	}
}
