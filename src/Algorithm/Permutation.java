package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Permutation {

	private static int n, m;
	private static int[] arr;
	private static Boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visited = new Boolean[n+1];
		
		p(0);
		System.out.println();
		p2(0);
		
	}

	private static void p(int cnt) {
		
		if(cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=1; i<=n; i++) {
			if(visited[i] == null || !visited[i] ) {
				visited[i] = true;
				arr[cnt] = i;
				p(cnt+1);
				visited[i] = false;
			}
		}
		
		
	}
	
	private static void p2(int cnt) {
		if(cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i=1; i<=n; i++) {
			arr[cnt] = i;
			p2(cnt +1);
		}
	}
}
