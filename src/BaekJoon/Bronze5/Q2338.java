package BaekJoon.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2338 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	    BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}
	
}
