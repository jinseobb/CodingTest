package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		sb.append("<");
		
		while(q.size()>1) {
			for(int i=0; i<k-1; i++) {
				int m = q.poll();
				q.offer(m);
			}
			int kk = q.poll();
			sb.append(kk).append(", ");
			
		}
		sb.append(q.poll()).append(">");
		
		System.out.println(sb);
	}
}
