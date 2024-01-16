package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {
 static int back;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			if(tmp.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				q.add(num);
				back = num;
			}else if(tmp.equals("pop")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
				sb.append(q.poll()).append("\n");
				}
			}else if(tmp.equals("size")) {
				sb.append(q.size()).append("\n");
				
			}else if(tmp.equals("empty")) {
				if(q.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}else if(tmp.equals("front")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(q.peek()).append("\n");
				}
			}else if(tmp.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(back).append("\n");
				}
			}
		}
		System.out.println(sb);
	}//main
	
	
	
}
