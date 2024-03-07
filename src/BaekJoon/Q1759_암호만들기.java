package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759_암호만들기 {
	static int n,m;
	static String[] arr;
	static String[] number;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new String[n];
		number = new String[m];
		visited = new boolean[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			String s = st.nextToken();
			number[i] = s;
		}
		Arrays.sort(number);
		DFS(0,0);
		System.out.println(sb);
	}
	private static void DFS(int depth, int start) {
		if(depth == n) {
			if(checkValid(arr)) {
				
				for(int i=0; i<n; i++) {
					sb.append(arr[i]);
				}
				sb.append("\n");
			}
			return;
		}
		for(int i=start;i<m;i++) {
			if(visited[i]) {
				continue;
			}
			visited[i] = true;
			arr[depth] = number[i];
			DFS(depth+1,i+1);
			visited[i] = false;
		}
		
	}
	private static boolean checkValid(String[] arr2) {
		int mcount = 0;
		int zcount = 0;
		for(int i=0; i<arr2.length;i++) {
			if(arr2[i].equals("a") || arr2[i].equals("e") || arr2[i].equals("i") || arr2[i].equals("o")
					|| arr2[i].equals("u")) {
				mcount++;
			}else {
				zcount++;
			}
			
				
		}
		if(mcount >= 1 && zcount >=2) {
			return true;
		}
		return false;
	}
}
