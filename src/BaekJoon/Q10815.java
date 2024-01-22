package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(answer(arr,target)).append(" ");
		}
		
		System.out.println(sb);
		
	}

	private static int answer(int[] arr, int target) {

		int start = 0;
		int end = arr.length;
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return 1;
			}else if (arr[mid] < target) {
				start = mid +1;
			}else {
				end = mid ;
			}
		}
		
		return 0;
	}
	
}
