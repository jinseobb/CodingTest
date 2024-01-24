package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n        = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(Upper(arr,target) - Lower(arr,target)).append(" ");
		}
	
	  System.out.println(sb);
	}

	private static int Lower(int[] arr, int target) {

		int start = 0;
		int end = arr.length;
		
		while(start < end) {
		int mid = start + (end - start)/2;	
		
		if(arr[mid]<= target ) {
			start = mid + 1;
		}else {
			end = mid;
		}
	
		}
		
		return end;
	}

	private static int Upper(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while(start < end) {
		int mid = start + (end - start)/2;	
		if(arr[mid] < target) {
			start = mid + 1;
		}else {
			end = mid;
		}
		}
		
		return end;
	}
	
}
