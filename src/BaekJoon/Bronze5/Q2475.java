package BaekJoon.Bronze5;


import java.util.Scanner;

public class Q2475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i =0; i<5; i++) {
			int tmp = scan.nextInt();
			sum += tmp * tmp;
		}
	
		int result = sum % 10;
		
		System.out.println(result);
	}
}
