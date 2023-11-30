import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
	
			Q2 t = new Q2();
		
		    Scanner in =new Scanner(System.in);
		    String input1 = in.nextLine();
	// String input2 = in.nextLine();
		   
		    
		    
		    
		    System.out.println(t.solution(input1));
		    return ;
		  }

	private String solution(String input1) {

		String answer = "";
		
		for(char x : input1.toCharArray()) {
			if(Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			} else {
				answer += Character.toUpperCase(x);
			}
		}
		
		return answer;
	}
		
	
	
	
}
