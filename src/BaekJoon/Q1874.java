package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Q1874 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int num = 1;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Boolean result =true;
		for(int i=0; i<n; i++) {
			int su = arr[i];
			if(su >= num) {
				while(su>=num) {
					stack.push(num++);
					sb.append("+").append("\n");
				}
				stack.pop();
				sb.append("-").append("\n");
			}else {
				int k = stack.pop();
				if(k > su) {
					System.out.println("NO");
					result = false;
				}else{
					sb.append("-").append("\n");
				}
			}
		}
		if(result) {
			System.out.println(sb);
		}
	} // main
	
	
}

