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
	StringTokenizer st = new StringTokenizer(br.readLine());
	
    int count = 0;
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    HashMap<String,Integer>map1 = new HashMap<>();
    HashMap<String,Integer>map2 = new HashMap<>();
    
    for(int i=0; i<n; i++) {
    	String tmp = br.readLine();
    	map1.put(tmp, map1.getOrDefault(tmp, 0) + 1);
    }
	
    for(int i=0; i<m; i++) {
    	String tmp = br.readLine();
    	map2.put(tmp, map2.getOrDefault(tmp, 0) +  1);
    	if(map1.containsKey(tmp)) {
    		count++;
    	}
    		
    	
    }
    
    sb.append(count).append("\n");
    
    for(String ket : map1.keySet()) {
    	if(map2.containsKey(ket)) {
    		sb.append(ket).append("\n");
    	}
    }
    System.out.println(sb);
	}
	
}
