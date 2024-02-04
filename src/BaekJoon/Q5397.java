package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q5397 {
	
	static String key;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            key = br.readLine();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (int j = 0; j < key.length(); j++) {
                char cc = key.charAt(j);
                if (cc == '<') {
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                } else if (cc == '>') {
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                } else if (cc == '-') {
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                } else {
                    left.push(cc);
                }
            }

            while (!left.isEmpty()) {
                right.push(left.pop());
            }

            while (!right.isEmpty()) {
                sb.append(right.pop());
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());

	}
}
