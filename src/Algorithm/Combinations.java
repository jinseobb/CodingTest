package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Combinations {
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
		c(0,1);
		System.out.println("중복조합");
		c2(0,1);
	}

	//조합
	private static void c(int cnt, int start) {

		//return
		if(cnt == m ) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i=start; i<=n; i++) {
			arr[cnt] = i;
			c(cnt+1, i +1);
		}	
		
	}
	
	//중복조합
	private static void c2(int cnt, int start) {
		if(cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i=start; i<=n; i++) {
			arr[cnt] = i;
			c2(cnt+1, i);
		}
	}
}
