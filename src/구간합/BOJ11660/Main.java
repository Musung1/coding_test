package 구간합.BOJ11660;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][] A;
    static int[][] S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n+1][n+1];
        S = new int[n+1][n+1];
        for (int i = 1; i <= n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n ; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // S 초기화
        S[1][1] = A[1][1];
        for (int i = 2; i <= n ; i++) {
            S[1][i] = S[1][i-1] + A[1][i];
            S[i][1] = S[i-1][1] + A[i][1];
        }

        for (int i = 2; i <= n ; i++) {
            for (int j = 2; j <= n ; j++) {
                S[i][j] = S[i-1][j] + S[i][j-1] + A[i][j] - S[i-1][j-1];
            }
        }
//        System.out.println();
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n ; j++) {
//                System.out.print(S[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = S[x2][y2] - S[x1 -1][y2] - S[x2][y1 - 1] + S[x1-1][y1-1];
            System.out.println(result);
        }
    }
}