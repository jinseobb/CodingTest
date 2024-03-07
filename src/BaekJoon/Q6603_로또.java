package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	public class Q6603_로또 {
		static int[] arr;
		static int[] number;
		static boolean[] visited;
		static int n;
		static StringBuilder sb ;
		public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        while(true) {
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            n = Integer.parseInt(st.nextToken());
	            if(n== 0) {
	                break;
	            }
	            number = new int[n+1];
	            arr = new int[n];
	            visited = new boolean[n+1];
	            for(int i=1; i<=n; i++) {
	                int s = Integer.parseInt(st.nextToken());
	                number[i] = s;
	            }
	            sb = new StringBuilder();
	            DFS(0,1);
	            System.out.println(sb);
	        }
	    }

	    private static void DFS(int depth, int next) {
	        if(depth == 6) {
	            for(int i=0; i<6;i ++) {
	                sb.append(arr[i]).append(" ");
	            }
	            sb.append("\n");
	            return;
	        }
	        for(int i=next; i<=n; i++) {
	            if(visited[i]) {
	                continue;
	            }
	            visited[i] = true;
	            arr[depth] = number[i];
	            DFS(depth+1,i+1);
	            visited[i] = false;
	        }
	    }
	
}
