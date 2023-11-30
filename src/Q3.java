import java.util.ArrayList;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Q3 t =  new Q3();
		
		Scanner scan = new Scanner(System.in);
		
		String i1 = scan.nextLine();
		
		System.out.println(t.solution(i1));
		
	}

	private String solution(String i1) {

		String answer = "";
		
		int m = Integer.MIN_VALUE;
		
		String[] s = i1.split(" ");
		
		
		for(String x : s) {
			int len = x.length();
			
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}
	
	
}
