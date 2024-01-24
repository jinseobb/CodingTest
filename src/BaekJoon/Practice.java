package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(br.readLine());
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
	
		
		
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<m; i++) {
    	int k = Integer.parseInt(st.nextToken());
    	sb.append(map.getOrDefault(k, 0)).append(" ");
    }
   System.out.println(sb);
   
	}
	
}
