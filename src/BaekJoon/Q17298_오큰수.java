package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17298_오큰수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] data = new int[n];
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			Integer k = Integer.parseInt(st.nextToken());
			data[i] = k;
		}
		
		for(int i=0; i<n; i++) {
			while(!stack.isEmpty() && data[stack.peek()] < data[i]) {
				data[stack.pop()] = data[i];
			}
			stack.push(i);
		}
		
		// 3 5 2 7 
		// 0 1 2 3 
		
		while(!stack.isEmpty()) {
			data[stack.pop()] = -1;
		}
		
		for(int i=0; i<data.length; i++) {
			sb.append(data[i]).append(" ");
		}
		System.out.println(sb);
	}
}
