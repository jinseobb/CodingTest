package Algorithm;

public class Recursive {

	
	public static int fibonacci(int number) {
	
		//반복문 피보나치 
		/*int one = 1;
		int two = 1;
		int result = -1;
		
		if(number == 1) {
			return one;
		}else if (number ==2) {
			return two;
		}else {
			for(int i=2; i<number; i++) {
				result = one + two;
				one = two;
				two = result;
				
			}
		
		
		}
		return result;
		*/
		
		if(number == 1) {
			return 1;
			
		} else if(number == 2) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number -2);
		}
		
	}
	
 public static void main(String[] args) {
 
	 System.out.println(fibonacci(20));
	
}

}

