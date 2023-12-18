package BaekJoon.Bronze4;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2083 {
 
	public static void main(String[] args) {
		
		Q2083 t = new Q2083();
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		while(sc.hasNextLine()){
            String name=sc.next();
            int age=sc.nextInt();
            int weight=sc.nextInt();
            if(name.equals("#") && age==0 && weight==0){
                break;
            }

            if(age>17 || weight>=80){
              //  System.out.println(name+" Senior");
                a.add(name + " Senior");
            }else{
               // System.out.println(name+" Junior");
            	 a.add(name + " Junior");
            }
        }
		// 입력된 결과를 한 번에 출력
        for (String result : a) {
            System.out.println(result);
        }
		
	}


	
}
