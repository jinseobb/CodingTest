package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650_N과M2 {
	static int n,m;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		visited = new boolean[n+1];
		BT(0,1);
		System.out.println(sb);
	}
	private static void BT(int depth, int start) {
		if(depth == m ) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<=n; i++) {
			if(visited[i]) {
				continue;
			}
			visited[start] = true;
			arr[depth] = i;
			BT(depth+1,i+1);
			visited[start] = false;
 		}
		
	}
}
