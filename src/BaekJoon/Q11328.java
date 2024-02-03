package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11328 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {			
			int[] arr = new int[26];
			int[] arr2 = new int[26];
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			for(int j=0; j<s1.length(); j++) {
				char[] cc = s1.toCharArray();
				arr[cc[j]-97]++;
			
			}
			
			for(int k=0; k<s2.length(); k++) {
				char[] cc2= s2.toCharArray();
				arr2[cc2[k]-97]++;
			
 			}
			
			if(Arrays.equals(arr, arr2)) {
				sb.append("Possible").append("\n");
			}else {
				sb.append("Impossible").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
