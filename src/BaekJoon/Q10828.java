package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.InputMap;

public class Q10828 {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			if(tmp.equals("push")) {
				s.add(Integer.parseInt(st.nextToken()));
			} else if(tmp.equals("pop")) {
				if(s.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(s.pop()).append("\n");
				}
			} else if(tmp.equals("size")) {
				sb.append(s.size()).append("\n");
			} else if(tmp.equals("empty")) {
				if(s.size() == 0) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			} else if(tmp.equals("top")) {
				if(s.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(s.peek()).append("\n");
				}
			}
			
		}
		
		System.out.println(sb);
	}
	
	
}
