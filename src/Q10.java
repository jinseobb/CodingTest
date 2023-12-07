import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Q10 t = new Q10();
	
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		char c1 = scan.next().charAt(0);
		
		for(int x : t.solution(s1,c1)) {
			System.out.println(x + "");
		}
	}

	private int[] solution(String s1, char c1) {

		
		int[] answer = new int[s1.length()];
		int index = 1000;
		
	    
		
		for(int i=0; i<s1.length(); i++) {
		
			char x = s1.charAt(i);
			
			if(x != c1) {
				index++;
				answer[i] =  index ;
				
			}
			else if(x == c1) {
				index = 0;
				answer[i] = index;
				
				
			}

		}
		index = 1000;
		for(int i = s1.length()-1; i>= 0; i--) {
			char x = s1.charAt(i);
			
			if(x != c1) {
				index++;
				answer[i] =  Math.min(answer[i], index);
				
			}
			else if(x == c1) {
				index = 0;
				answer[i] = index;
				
				
			}
		}
		
		
		return answer;
	}
}
