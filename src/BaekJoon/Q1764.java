package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;

public class Q1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) );
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            map2.put(key, map2.getOrDefault(key, 0) );
            if (map.containsKey(key)) {
                count++;
            }
        }

        sb.append(count).append("\n");
        for (String key : map.keySet()) {
            if (map2.containsKey(key)) {
                sb.append(key).append("\n");
            }
        }
        System.out.println(sb);
    }
}
