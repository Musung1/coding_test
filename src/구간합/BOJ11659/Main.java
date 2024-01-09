package 구간합.BOJ11659;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static int n,m;
    static int[] A;
    static int[] S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n+1];
        S = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        S[1] = A[1];
        for (int i = 2; i <= n ; i++) {
            S[i] = S[i-1] + A[i];
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            System.out.println(S[second] - S[first -1]);
        }
    }
}