package BaekJoon.Bronze4;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		
		Q2439 t = new Q2439();
		
		Scanner scan = new Scanner(System.in);
		
		int i1 = scan.nextInt();
		
		for(int i=1; i<=i1; i++) {
			for(int j=1; j<=i1-i; j++) {
				System.out.print(" ");
				
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
