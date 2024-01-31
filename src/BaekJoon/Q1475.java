package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
	 
		String tmp = br.readLine();
		
		for(int i=0; i<tmp.length(); i++) {
			int num = tmp.charAt(i) - '0';

			if(num == 9) {
				arr[6]++;
			}else {
				arr[num]++;
			}
		}
		
		if(arr[6] % 2 == 1) {
			arr[6] = arr[6] / 2 +1;
		}else {
			arr[6] = arr[6] / 2;
		}
		//int count = Math.max(arr[0],arr[arr.length-1]);
		
		//System.out.println(count);
		
		int max = 0;
		int count  = 0;
	for(int i=0; i<arr.length; i++) {
	
		max = Math.max(max, arr[i]);
	}	
	
	System.out.println(max);
	}
}
