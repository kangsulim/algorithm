package math.prefix_sum;

import java.util.Scanner;
// https://www.acmicpc.net/problem/11659
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        long[] A = new long[M + 1];

        for (int k = 1; k < N + 1; k++) {
            A[k] = scan.nextInt();
        }

        long[] S = new long[M + 1];
        S[1] = A[1];

        for (int k = 2; k < M + 1; k++) {
            S[k] = S[k - 1] + A[k];
        }

        for (int k = 1; k < M + 1; k++) {
            System.out.println(S[k]);
        }

        for (int k = 1; k < M + 1; k++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            System.out.println(S[j] - S[i - 1]);
        }
    }
}
