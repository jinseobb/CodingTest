package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663_NQuenn {
	static int[]arr;
	static boolean[] visited;
	static int N, count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visited = new boolean[N];
		count = 0;
		BT(0);
		System.out.println(count);
	}
	// 백트래킹 함수
	private static void BT(int i) {
	    // 행이 마지막에 도달했을 경우
	    if(i == N) {
	        // 가능한 퀸의 배치 방법 수를 증가시키고 함수 종료
	        count++;
	        return;
	    }
	    // 현재 행에서 각 열마다 검사
	    for(int j=0; j<N; j++) {
	        // 현재 행에 퀸을 놓습니다.
	        arr[i] = j;
	        // 현재 퀸의 위치가 유효한지 검사합니다.
	        if(check(i)) {
	            // 유효하다면 다음 행으로 진행합니다.
	            BT(i+1);
	        }
	    }
	}

	// 퀸의 위치가 유효한지를 검사하는 함수
	private static boolean check(int num) {
	    // 현재 행보다 이전의 행들을 검사합니다.
	    for(int i=0; i<num; i++) {
	        // 같은 열에 퀸이 있는지 확인
	        if(arr[num] == arr[i]) {
	            return false;
	        // 대각선 상에 퀸이 있는지 확인
	        } else if(Math.abs(num-i) == Math.abs(arr[num]-arr[i])) {
	            return false;
	        }
	    }
	    // 유효한 위치에 퀸이 없다면 true 반환
	    return true;
	}

}
