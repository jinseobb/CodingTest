package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<m; i++) {
			Boolean b = true;
			String tmp = br.readLine();
			Stack<String> s = new Stack<>();
			for(int j=0; j<tmp.length(); j++) {
				char c = tmp.charAt(j);
				if(c == '(') {
					s.push(String.valueOf(c));
				}else if (c ==')') {
					if(!s.isEmpty() && s.peek().equals("(")) {
						s.pop();
					}else {
						b = false;
				
					}
				}
			}
			
			if( s.isEmpty() && b) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
			
		}
		System.out.println(sb);
		
		
	}//main
	
}
