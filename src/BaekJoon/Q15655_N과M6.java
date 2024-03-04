package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15655_N과M6 {
	static int n,m;
	static int[] arr;
	static boolean[] visited;
	static int[] number;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		number = new int[n+1];
		visited = new boolean[n+1];
		for(int i=0; i<n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(number);
		BT(0,1);
		System.out.println(sb);
	}
	private static void BT(int depth, int next) {
		if(depth ==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=next; i<=n;i++) {
			if(visited[i]) {
				continue;
			}
			visited[i] = true;
			arr[depth] =number[i];
			BT(depth+1,i+1);
			visited[i] = false;
		}
		
	}
	
}
