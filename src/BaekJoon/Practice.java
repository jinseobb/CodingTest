package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			Stack<String> s = new Stack<>();
			Boolean b = true;
		//	StringTokenizer st = new StringTokenizer(br.readLine());
			String tmp = br.readLine();
			
			for(int j=0; j<tmp.length(); j++) {
							
				char c = tmp.charAt(j);
				if( c == '(') {
					s.push(String.valueOf(c));
				}else  if(c == ')'){
					if(!s.isEmpty() && s.peek().equals("(")) {
					s.pop();	
					}else {
						b = false;
					}
				}
			}
			if(s.isEmpty()&& b) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}
