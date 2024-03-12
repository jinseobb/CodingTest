package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18808_스티커붙이기 {
    static int n, m, count, r, c, result = 0;
    static int[][] notebook;
    static int[][] sticker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        notebook = new int[n][m];
        count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            sticker = new int[r][c];
            for (int j = 0; j < r; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < c; k++) {
                    sticker[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for (int rotate = 0; rotate < 4; rotate++) {
           
                if (attach(sticker)) {
                    break;
                }
                sticker = rotate(sticker);
            }

        }

        // 결과 출력
        System.out.println(result);
    }

    private static int[][] rotate(int[][] sticker2) {
        int r = sticker2.length;
        int c = sticker2[0].length;
        int[][] newsticker = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newsticker[j][r - 1 - i] = sticker2[i][j];
            }
        }

        return newsticker;
    }

 
    private static boolean attach(int[][] sticker2) {
        for (int i = 0; i < n - sticker2.length + 1; i++) {
            for (int j = 0; j < m - sticker2[0].length + 1; j++) {
                if (check(sticker2, i, j)) {
                   attachone(sticker2,i,j);
                	   return true;
                  
            }
        }
    }

        return false;
    }
	private static void attachone(int[][] sticker, int row, int col) {
		for (int i = 0; i < sticker.length; i++)
			for (int j = 0; j < sticker[0].length; j++)
				if (sticker[i][j] == 1) { // 붙이는게 스티커 부분이면 result +1
					notebook[row + i][col + j] = sticker[i][j];
					result++;
				}		
	}

	private static boolean check(int[][] sticker, int row, int col) {
		for(int i=0; i<sticker.length;i++) {
			for(int j=0; j<sticker[0].length;j++) {
				if(sticker[i][j] == 1 && notebook[row+i][col+j] == 1) {
					return false;
				}
			}
		}
		
		return true;
	}

}
