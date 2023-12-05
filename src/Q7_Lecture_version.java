import java.util.Scanner;

public class Q7_Lecture_version {
	public static void main(String[] args) {
		Q7_Lecture_version t = new Q7_Lecture_version();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(t.solution(str));
	}

	private String solution(String str) {
		String answer = "";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}
}
