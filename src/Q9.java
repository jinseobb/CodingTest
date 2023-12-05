import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Q9 t = new Q9();
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		
		System.out.println(t.solution(s1));
			
		
	}

	private int solution(String s1) {
		int answer = 0;

		for(char x : s1.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x-48);
			}
		}
		
		return answer;
	}
}
