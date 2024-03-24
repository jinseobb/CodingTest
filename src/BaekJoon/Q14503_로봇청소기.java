package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14503_로봇청소기 {
    static int[][] arr;
    static boolean[][] cleaned; // 방문한 위치를 표시할 배열
    static int N, M, r, c, direction, count, nextDirection;
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1}; // 북, 동, 남, 서

    static Queue<Pair> q = new LinkedList<>();

    static class Pair {
        private int x;
        private int y;
        private int direction;

        public Pair(int x, int y, int direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        cleaned = new boolean[N][M]; // 방문 여부를 나타내는 배열 초기화

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int ch = Integer.parseInt(st.nextToken());
                arr[i][j] = ch;
            }
        }

        q.offer(new Pair(r, c, direction));
        cleaned[r][c] = true; // 초기 위치 청소 여부 표시
        count = 1; // 초기 위치도 청소하므로 count를 1로 초기화
        BFS();
        System.out.println(count);
    }

    private static void BFS() {
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int nextDirection = p.direction;
            boolean moved = false;
            if (arr[p.x][p.y] == 0) {
                arr[p.x][p.y] = 2;
            }
            for (int i = 0; i < 4; i++) {
                nextDirection = (nextDirection + 3 ) % 4; // 왼쪽 방향으로 회전
              
            /*if(nextDirection == 0) {
          		nextDirection = 3;
                }else if ( nextDirection == 1) {
                	nextDirection = 0;
                }else if ( nextDirection == 2) {
                	nextDirection = 1;
                }else if ( nextDirection == 3) {
                	nextDirection = 2;
                }*/
            	
                int nx = p.x + dx[nextDirection];
                int ny = p.y + dy[nextDirection];
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if (arr[nx][ny] == 0 && !cleaned[nx][ny]) {
                    cleaned[nx][ny] = true;
                    q.offer(new Pair(nx, ny, nextDirection));
                    count++;
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                int d = (p.direction + 2) % 4; // 후진
                int bx = p.x + dx[d]; // 후진하는 경우 방향의 반대로 이동
                int by = p.y + dy[d];
                if (bx < 0 || by < 0 || bx >= N || by >= M || arr[bx][by] == 1) {
                    return;
                }
                q.offer(new Pair(bx, by, p.direction));
            }
        }
    }
}



