package math.avg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long sum = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            int temp = scan.nextInt();
            if (temp > M) M = temp;
            sum += temp;
        }

        System.out.println(sum * 100.0 / M / N);
    }
}
