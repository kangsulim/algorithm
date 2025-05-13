package sumOfNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int length = scan.nextInt();
        scan.nextLine();

        String N = scan.nextLine();

        for (int i = 0; i < length; i++) {
            sum += N.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
