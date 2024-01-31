package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int[] c = new int[26];
		
		for(int i=0; i<tmp.length(); i++) {
		char ch = tmp.charAt(i);	
		c[ch-97]++;
		}
		
		for(int i=0; i<c.length; i++) {
			//System.out.println(c[i]);
		sb.append(c[i]).append(" ");
		
		}
		System.out.println(sb);
	}
}
