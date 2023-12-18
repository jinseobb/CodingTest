package BaekJoon.Bronze3;

import java.util.Scanner;

public class Q2443 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		for(int i=1; i<=n; i++) {
		
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*(n-i)+1 ; j++) {
				System.out.print("*");
			}

			System.out.println(" ");
			
		}
		
	}
}
