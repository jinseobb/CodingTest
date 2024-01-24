package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
	int num = 1;
	Boolean b = true;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int m = Integer.parseInt(br.readLine());
	StringBuilder sb = new StringBuilder();
	int[] arr = new int[m];
	for(int i=0; i < m;i ++) {
	 arr[i] = Integer.parseInt(br.readLine());
	}
	
	Stack<Integer> s = new Stack<>();
	for(int i=0; i<m; i++) {
		int k = arr[i];
		if(k>= num) {
		while(k>=num) {
			s.push(num++);
			sb.append("+").append("\n");
		}
		s.pop();
		sb.append("-").append("\n");
		}else {
			int kk = s.pop();
			if(kk > num) {
				System.out.println("NO");
				b = false;
				break;
			}else {
				sb.append("-").append("\n");
			}
		}
	}
	if(b) {
		System.out.println(sb);	
	}
	
	}
	
}
