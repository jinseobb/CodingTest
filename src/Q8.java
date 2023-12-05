import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Q8 t =  new Q8();
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

	
		System.out.println(t.solution(s1));
	}

	private String solution(String s1) {

		String answer ="";
		String s2 = "";
		s1 = s1.toUpperCase().replaceAll("[^a-zA-Z^]", "");
		
		char[] c = s1.toCharArray();
		int lt = 0;
		int rt = s1.length()-1;
		while(lt < rt ) {
			char tmp = c[lt];
			c[lt] = c[rt];
			c[rt] = tmp;
			lt ++;
			rt --;
		}
		
		s2 = String.valueOf(c);
		//System.out.println(s2);
		//System.out.println(s1);
		if(s1.equals(s2.toUpperCase())) {
			answer ="YES";
		}else {
			answer = "NO";
		}
		
		return answer;
	}
	
	
}
