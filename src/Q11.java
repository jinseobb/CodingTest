import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Q11 t = new Q11();
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		
		System.out.println(t.solution(s1));
	}

	private String solution(String s1) {

		String answer ="";
		
		int count = 1;
		
		for(int i=0; i< s1.length()-1; i++ ) {
			char x = s1.charAt(i);
			if(x != s1.charAt(i + 1)) {
				if(count == 1) {
					answer = answer + String.valueOf(x);
				}
				else if (count != 1) {
					answer = answer + String.valueOf(x) + String.valueOf(count);
					count = 1;
				}
				
			} else if (x == s1.charAt(i + 1))  {
				//answer = answer + String.valueOf(x) + String.valueOf(count);
				count ++;
			//	answer = answer + String.valueOf(count); 
			}
		}
		char lastchar = s1.charAt(s1.length()-1);
	 
		answer = answer + String.valueOf(lastchar) + String.valueOf(count);
		
		
		return answer;
	}
	
	
	
}
