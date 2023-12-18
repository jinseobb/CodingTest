package BaekJoon.String;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

		Q1 t = new Q1();
		
		Scanner scan = new Scanner(System.in);
		
		int i1 = scan.nextInt();
		scan.nextLine();
		
		String[] input = new String[i1];
		
		for(int i=0; i<i1;i ++) {
		
			input[i] = scan.nextLine();
			
		}
		
		for(String s1 : input) {
			
			System.out.println(t.solution(s1));
		}
		
		
		
}

	private String solution(String s1) {

		String answer = "";
		
		
		char c = s1.charAt(0);
		char d = s1.charAt(s1.length()-1);
		

		
		answer = String.valueOf(c) + String.valueOf(d);
		return answer;
	}

	
}