package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799_쇠막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Stack<Character> stack = new Stack<>();
		long count = 0;
		for(int i=0; i<tmp.length(); i++) {
			char c = tmp.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}
				
			
			if( c == ')') {
				stack.pop();
				if(tmp.charAt(i-1) == '(') {
					
					count += stack.size();
				}else if (tmp.charAt(i-1)== ')') {
				
					count += 1;
				}
			}
		} // for
		System.out.println(count);
	} //main
}
