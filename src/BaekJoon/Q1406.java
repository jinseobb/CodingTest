package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		Stack<Character> left = new Stack<>();
		Stack<Character >right = new Stack<>();

		for(int i=0; i<s.length(); i++) {
			left.push(s.charAt(i));
		}
		
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			char c = word.charAt(0);
			if(c == 'L') {
				if(!left.isEmpty()) {
				right.push(left.pop());
				}
			}else if (c == 'D') {
				if(!right.isEmpty()) {
					left.push(right.pop());
					
				}
			}else if(c == 'B') {
				if(!left.isEmpty()) {
					left.pop();
				}
			}else if (c == 'P') {
				left.push(word.charAt(2));
			}
		}
		
		// left 스택의 내용을 right 스택으로 옮김
        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        // right 스택의 내용을 StringBuilder에 추가
        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

      System.out.println(sb);
	}
	
}
