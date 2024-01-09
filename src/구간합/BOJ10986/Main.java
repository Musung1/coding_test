//package 구간합.BOJ10986;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    static int n,m;
//    static long[] A;
//    static long[][] S;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        A = new long[n+1];
//        S = new long[n+1][n+1];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <=n ; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        //S[i][j] = i ~ j 까지의 부분 합
//        for (int i = 0; i < n; i++) {
//            S[0][i] = S[0][i-1] + A[i];
//        }
//        for (int i = 2; i <= n ; i++) {
//            S[i] = S[i-1] + A[i];
//        }
//        int count = 0;
//        for (int i = n; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                if ((S[i] - S[j-1]) % m == 0) count++;
//            }
//        }
//        System.out.println(count);
//    }
//}