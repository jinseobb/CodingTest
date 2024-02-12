package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2504_괄호의값 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean check = true;
		long count = 0;
		long value = 1;
		for(int i=0; i<tmp.length(); i++) {
			char c = tmp.charAt(i);
			if(c == '(') {
				stack.push(c);
				value *= 2;
			}else if ( c =='[') {
				stack.push(c);
				value *= 3;
			}else if ( c == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					check = false;
					break;
				}else if (tmp.charAt(i-1) == '(') {
						count += value;
				}
				stack.pop();
				value /= 2;
				
				
			}else if ( c ==']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					check = false;
					break;
				}else if(tmp.charAt(i-1) == '['){
						count += value;
				}
				stack.pop();
				value /= 3;
			}
		
		}
		
			
		if(stack.isEmpty() && check) {
			System.out.println(count);
		}else {
			System.out.println(0);
		}
		
		
} // main

}
