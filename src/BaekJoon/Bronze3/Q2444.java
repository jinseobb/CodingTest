package BaekJoon.Bronze3;

import java.util.Scanner;

public class Q2444 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt()	;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>i; j-- ) {
				System.out.print(" ");
			}
				
				for(int j=1; j<=2*i-1; j++) {
					System.out.print("*");
				}
			
			System.out.println(" ");
		} // for
		/*for(int i = n - 1; i >= 1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
		}*/
		for(int i=1; i<=n-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<-2 * i + (2 * n - 1);j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
	}
}
