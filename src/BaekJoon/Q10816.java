package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int value = Integer.parseInt(st.nextToken());
			sb.append(Lower(arr,value) - Upper(arr,value)).append(" ");
		}
		System.out.println(sb);
	}

	private static int Lower(int[] arr, int value) {

		int start = 0;
		int end = arr.length;
		while(start < end) {
			int mid = start+(end -start)/2;
			if(arr[mid] <= value) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		
		return end;
	}

	private static int Upper(int[] arr, int value) {
		int start = 0;
		int end = arr.length;
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid]< value) {
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		return end;
	}
}
