package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
            s.push(num);   
            }else{
               // 스택이 비어있지 않은 경우에만 pop
                if (!s.isEmpty()) {
                    s.pop();
                }
            } //else
            
        } //for
              
        int sum = 0;
       
        while(!s.isEmpty()){
           sum = sum + s.pop(); 
        }
           
        System.out.println(sum);  
    } // main
    
}
