import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Main t = new Main();
		
		Scanner scan =new Scanner(System.in);
		
	    String str = scan.nextLine();
	    
	    char c = scan.next().charAt(0);
	    
//	    solution();
	    
	   
	    
	    System.out.println(t.solution(str, c));
	    return ;
	}

	private int solution(String str, char t) {

		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);

		//System.out.print(str + t);
		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == t ) {
//				answer++;
//			}
//		}
		
		for(char x : str.toCharArray()) {
			if(x == t) {
				answer++;
			}
		}
		
		return answer;
		
	}
}



