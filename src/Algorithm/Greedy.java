package Algorithm;

import java.util.Scanner;

public class Greedy {

	public static void main(String[] args) {
		Greedy t = new Greedy();
		
		Scanner scan = new Scanner(System.in);
		
		int n  = scan.nextInt();
		int k = scan.nextInt();
		
		System.out.println(t.solution(n,k));	
	}

	private int solution(int n, int k) {

		int count = 0;
		//int result = 0;
		
		while(n > 1) {
			if ( n % k != 0) {
				n = n-1;
			}else {
				n = n/k;
			}
			count ++;
		}
			
		
		return count;
	}
	
}
