package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986_좋은단어 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long count = 0;
		for(int i=0 ;i<n; i++) {
			String tmp = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<tmp.length(); j++) {
				if(!stack.isEmpty() && stack.peek() == tmp.charAt(j)) {
					stack.pop();
				}else {
					stack.push(tmp.charAt(j));
				}				
			} // for
			
			if(stack.isEmpty()) {
				count++;
			}
		
		}
		System.out.println(count);
		
	}
}
