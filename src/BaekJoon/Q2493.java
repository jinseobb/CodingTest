package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=1; i<=n; i++) {
			int top = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty()) {
				if(stack.peek()[1] < top) {
					stack.pop();
		
				}else {
					sb.append(stack.peek()[0]).append(" ");
					break;
				}
			}
			if(stack.isEmpty()) {
				sb.append("0").append(" ");
				
			}
			stack.push(new Integer[] {i,top});
		}
			
	
		System.out.println(sb);
	}
}
