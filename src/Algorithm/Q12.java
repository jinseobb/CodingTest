package Algorithm;

import java.util.Scanner;

public class Q12 {
public static void main(String[] args) {
	Q12 t = new Q12();
    
	Scanner scan = new Scanner(System.in);
	
	int i1 = scan.nextInt();

	scan.nextLine();
	String s1 = scan.nextLine();
	
	System.out.println(t.solution(i1,s1));
}




private String solution(int i1, String s1) {

	String answer = "";
	
	for(int i=0; i<i1; i++) {
		String tmp = s1.substring(0,7).replace('#', '1').replace('*', '0');
		int num = Integer.parseInt(tmp,2);
		answer += (char)num;
		s1 = s1.substring(7);
	}
	
	return answer;
}





}
