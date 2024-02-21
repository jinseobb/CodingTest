package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q2667_단지번호붙이기 {
	static int n, count, danzicount, max;
	static int[][] arr;
	static boolean[][] visited;
	static Queue<Pair> q = new LinkedList<>();
	static class Pair{
		private int x;
		private int y;
		public Pair(int x, int y) {
			this.x = x; 
			this.y = y;
		}
	}
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static StringBuilder sb;
	static ArrayList<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visited = new boolean[n][n];
		for(int i=0; i<n; i++) {
			String tmp = br.readLine();
			for(int j=0; j<n; j++) {
				char  c = tmp.charAt(j);
				arr[i][j] = c - '0';
			}
		}
		list = new ArrayList<>();
		//	r시작
		count =0;
		danzicount = 1;
		max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					q.offer(new Pair(i,j));
					visited[i][j] = true;
					count++;
					bfs(i,j);
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//System.out.println(sb);
	} // main

	private static void bfs(int i, int j) {
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int k=0; k<4; k++) {
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx < 0 || ny < 0 || nx >= n|| ny >= n) {
					continue;
				}
				if(arr[nx][ny] == 1 && !visited[nx][ny]) {
					q.offer(new Pair(nx,ny));
					visited[nx][ny] = true;
					danzicount++;
				}
			}
		}
		
		
		list.add(danzicount);
		//	sb.append(danzicount+1).append("\n");
		
		
		danzicount = 1;
		
			
		
	}
	














}
