package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Q15663_N과M9 {
	static int n,m;
	static int[] arr;
	static boolean[] visited;
	static int[] number;
	static HashSet<String> set;
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
		set = new LinkedHashSet<>();
		for(int i=1; i<=n; i++) {
		number[i] = Integer.parseInt(st.nextToken());
	
		}
		
		Arrays.sort(number);
		BT(0);
		
		set.forEach(System.out::println);

	}
	private static void BT(int depth) {
		
		if(depth == m) {
		sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			sb.append(arr[i]).append(" ");
		}
		set.add(sb.toString());
			
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if (!visited[i]) {
                visited[i] = true;
                arr[depth] = number[i];
                BT(depth+1);
                visited[i] = false;
            }
		}
	}
}
