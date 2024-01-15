package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Test {
	static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	
	int[][]mm = new int[n][m];
	
	
	
	for(int i=0; i<n; i++) {
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<m; j++) {
			mm[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	//System.out.println(mm.length);
	
	for(int i=0; i<n/2; i++) {
		for(int j=0; j<m; j++) {
			int temp = mm[i][j];
			mm[i][j] = mm[n-1-i][j];
			mm[n-1-i][j] = temp;
			}
	}
	
	for (int[] row : mm) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
	System.out.println(matrix.length);
	 Test.rotate(matrix);
	 
	 printMatrix(matrix);
}
	
	
	


private static void rotate(int[][] matrix) {

	int n = matrix.length;
	
	for(int i=0; i<n/2; i++) {
		for(int j=0; j<n; j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[n-i-1][j];
			matrix[n-i-1][j] = temp;
					}
	}
	
	
}

private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


	
}
