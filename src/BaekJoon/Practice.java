package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice {

	
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Integer n = Integer.parseInt(br.readLine());
        int count = 0;
        for(Integer i=0; i<n; i++) {
        	Integer num = Integer.parseInt(br.readLine());
        	while(!stack.isEmpty()) {
        		if(stack.peek()[1] <= num) {
        			stack.pop();
        		}else {
        			break;
        		}
        	}
        	count += stack.size();
        
        	stack.push(new Integer[] {i,num});
        }
        
        System.out.println(sb);
    }
    
	
}
