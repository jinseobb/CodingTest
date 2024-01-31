package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int sum = a * b * c;
		
		int[] arr = new int[10];
		
		String tmp = Integer.toString(sum);
		
		for(int i=0; i<tmp.length(); i++) {
			int cc=tmp.charAt(i)-'0'; 
			arr[cc]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
}
