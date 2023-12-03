import java.util.ArrayList;
import java.util.Scanner;

public class Q4_Lecture_version {

	public static void main(String[] args) {
		
		
		Q4_Lecture_version t = new Q4_Lecture_version();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : t.solution(n,str)) {
		
			System.out.println(x);
		}
	}

	private ArrayList<String> solution(int n, String[] str) {

		ArrayList<String> answer = new ArrayList<String>();
		
		//StringBuilder 사
	/*	for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/
			
		for(String x : str) {
			char[] s = x.toCharArray();
		
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
			 
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
}
