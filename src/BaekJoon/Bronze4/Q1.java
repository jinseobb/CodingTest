package BaekJoon.Bronze4;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Q1 t = new Q1();
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		while(true) {
			
		  String input = scan.nextLine();
		  a.add(input);
		  
		  if(input.equals("#")) {
			  break;
		  }
		}
		
		for(int i=0; i<a.size(); i++) {
		  if(!a.get(i).equals("#"))
			System.out.println(t.solution(a.get(i)));
		}
	}

	private int solution(String a) {

		int answer = 0;
		
        String[] x = a.split("[^a-zA-Z^]");
        
        for(int i=0; i<x.length; i++) {
        	
        	char[] c = x[i].toCharArray();
        	
        	 for (int j = 0; j < c.length; j++) {
                 
        		 if ("aeiouAEIOU".indexOf(c[j]) != -1) {
        			    answer++;
        			}

             }
        }
        	
       
		return answer;
	}
}
