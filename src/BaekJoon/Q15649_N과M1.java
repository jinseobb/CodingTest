package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15649_N과M1 {
	static int n,m;
	static int[] selected;
	static boolean[] visited;
	static StringBuilder sb;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken()); 
		selected = new int[n];
		arr = new int[n+1];
		visited = new boolean[n+1];
		sb = new StringBuilder();
		backtracking(0);
		System.out.println(sb);
	}

	private static void backtracking(int i) {
		if(i == m) {
			for(int j=0;j<m;j++) {
				sb.append(selected[j]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int j=1; j<=n; j++) {
			if(visited[j]) {
				continue;
			}
			visited[j] = true;
			selected[i] = j;	
			
			backtracking(i+1);
			visited[j] = false;
		}
	}

	
}


