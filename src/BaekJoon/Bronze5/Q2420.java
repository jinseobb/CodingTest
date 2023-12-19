package BaekJoon.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2420 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		BigInteger c = a.subtract(b);
		
		System.out.println(c.abs());
	}
}
