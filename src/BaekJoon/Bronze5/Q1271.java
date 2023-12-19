package BaekJoon.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String s1 = scan.nextLine();
		
		//String[] sa = s1.split(" ");
		
	   // int a = Integer.parseInt(sa[0]) ; 
	   // int b = Integer.parseInt(sa[1]);
	    
		BigInteger a = scan.nextBigInteger();
	    BigInteger b = scan.nextBigInteger();
		
	    System.out.println(a.divide(b));
	    System.out.println(a.remainder(b));
	}
}
