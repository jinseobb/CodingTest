
package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7569_토마토3차원 {
    static int n, m, h, count, finalcount;
    static int[][][] arr;
    static boolean[][][] visited;
    static int dx[] = {1, 0, -1, 0, 0, 0};
    static int dy[] = {0, 1, 0, -1, 0, 0};
    static int dz[] = {0, 0, 0, 0, 1, -1};
    static Queue<Pair> q;

    static class Pair {
        private int x;
        private int y;
        private int z;
        private int day;

        public Pair(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        count = 0;
        finalcount = 0;
        arr = new int[h][n][m];
        visited = new boolean[h][n][m];
        q = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        q.offer(new Pair(j, k, i, 0));
                        visited[i][j][k] = true;
                    } else if (arr[i][j][k] == 0) {
                        count++;
                    }
                }
            }
        }

        bfs();
        if (count == 0) {
            System.out.println(finalcount);
        } else {
            System.out.println(-1);
        }
    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int k = 0; k < 6; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                int nz = p.z + dz[k];
                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < n && ny < m && nz < h) {
                    if (arr[nz][nx][ny] == 0 && !visited[nz][nx][ny]) {
                        q.offer(new Pair(nx, ny, nz, p.day + 1));
                        visited[nz][nx][ny] = true;
                        finalcount = p.day + 1;
                        count--;
                    }
                }
            }
        }
    }
}
