package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1919 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			int count = 0;
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			for(int j=0; j<s1.length();j++) {
				arr1[s1.charAt(j)-97]++;
			}
			
			for(int k=0; k<s2.length(); k++) {
				arr2[s2.charAt(k)-97]++;
			}
			
			for(int i=0; i<26; i++) {
				if(arr1[i] == arr2[i]) {
					continue;
				}else {
					count = count+ (Math.max(arr1[i], arr2[i]) - Math.min(arr1[i], arr2[i]));
				}
			}
		
		System.out.println(count);
		
	}
}
