package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		while(st.hasMoreTokens()) {
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			} //for
		}//while
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
	   
		int low = 0;
		int high = arr.length-1;
		
		for(int i=0; i<m; i++) {
			int in = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
			if(in <0) {
				sb.append(0).append("\n");
			}else {
				sb.append(1).append("\n");
			}
		}
		
		System.out.println(sb);
		
	} // main
}
