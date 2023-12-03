import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		
		
		
		Q4 t = new Q4();
	
		String i1 = "";
		String[] a1 = {}; 
			
		
		Scanner scan = new Scanner(System.in);
		int i2 = scan.nextInt();
		
	   if(i2 <= 20 && i2 >= 3) {
		   a1 = new String[i2];
		   for(int i=0; i<i2; i++) {
			   Scanner scan2 = new Scanner(System.in);
				i1 = scan2.nextLine();
			    a1[i] = i1;
			    
		   } 
	   }
	
	  //System.out.println(Arrays.toString(a1));
	   for(String x : t.solution(i2,a1)) {
		   System.out.println(x);
	   }

		
	}

	private ArrayList<String> solution(int i2, String[] a1) {

 		ArrayList<String> answer = new ArrayList<String>();
 		
 		for(String x : a1) {
 			String tmp = new StringBuilder(x).reverse().toString();
 		answer.add(tmp);
 		}
 		
		return answer;
	}

}
	
	

