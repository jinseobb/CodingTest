import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Q5 t = new Q5();
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine();
	
		System.out.println(t.solution(s1));
	
	}

	private String solution(String s1) {

		String answer = "";
		
		char[] c = s1.toCharArray();
		
		int lt = 0;
		int rt = c.length-1;
		
		while(lt < rt){
			if(Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt])) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
				
			}else if(!Character.isAlphabetic(c[lt])){
				lt++;
			}else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}
		}
		answer = String.valueOf(c);
		
		return answer;
	}


}
