package BaekJoon;

import java.util.Scanner;

public class Q10988 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine();
		
		Q10988 t = new Q10988();
		
		System.out.println(t.solution(s1));
	}

	private int solution(String s1) {

		int answer = 0;
		String ss = "";
		
		char[] x = s1.toCharArray();
		int lt = 0;
		int rt = s1.length()-1;
		
		while(lt < rt) {
			char tmp = x[lt];
			x[lt] = x[rt];
			x[rt] = tmp;
			lt++;
			rt--;
		}
		
		ss = String.valueOf(x);
		
		if(s1.equals(ss)) {
			answer = 1;
		}else {
			return answer;
		}
		
		return answer;
	}
	
	
}
