import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		Q7 t = new Q7();
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		
		System.out.println(t.solution(s1));
	}

	private String solution(String s1) {

		String answer ="";
		
		
		String s2 = "";
		int lt = 0;
		int rt = s1.length()-1;
		char[] c = s1.toUpperCase().toCharArray();
		
		while(lt < rt ) {
			char tmp = c[lt];
			c[lt] = c[rt];
			c[rt] = tmp;
			lt ++;
			rt --;
		}
		s2 = String.valueOf(c).toUpperCase();
		//System.out.println(s2);
		//System.out.println(c);
		if(s1.toUpperCase().equals(s2)) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		return answer;
	}
}
