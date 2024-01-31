package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3273 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0 ;
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int start = 0;
		int end = a-1;
		int sum = 0;
		while(start<end) {
			sum = arr[start] + arr[end];
			if(x > sum) {
				start++;
			}else if (x < sum) {
				end--;
			}else if (x == sum) {
				count++;
				end--;
				start++;
				
			}
		}
		
		System.out.println(count);
	}
}
