import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Q6 t = new Q6();
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		
		System.out.println(t.solution(s1));
	}

	private String solution(String s1) {

		String answer = "";
	
		for(int i=0; i<s1.length(); i++) {
			
			//System.out.println(s1.charAt(i) + "" + i + "" + s1.indexOf(s1.charAt(i)));
			
			if(s1.indexOf(s1.charAt(i)) == i) {
				
				answer = answer + s1.charAt(i);
				
			}
		}
		
		return answer;
	}

}
