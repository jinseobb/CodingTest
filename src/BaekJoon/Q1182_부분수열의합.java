package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182_부분수열의합 {
	static int N,M,count;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		count = 0;
		BT(0,0);
		System.out.println(count-1);
	}
	private static void BT(int depth, int sum) {
		if(depth == N) {
			if(sum == M) {
				count++;
			}
			return;
		}
		
		BT(depth+1,sum+arr[depth]);
		BT(depth+1,sum);
		
	}
}
