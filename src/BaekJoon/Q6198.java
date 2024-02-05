package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q6198 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer[]> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		long count = 0;
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine());
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1] <= k) {
					stack.pop();
				}else {
					break;
				}
			}
			count = count + stack.size();
	
				stack.push(new Integer[] {i,k});
			
		}
		System.out.println(count);
		
	}//main
}
