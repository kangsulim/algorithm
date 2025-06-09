package stack;
import java.util.*;

public class Stack01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sbuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = scan.nextInt();
        scan.nextLine(); // 개행 처리

        for (int i = 0; i < N; i++) {
            String s = scan.nextLine();
            String[] parts = s.split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "push":
                    stack.push(Integer.parseInt(parts[1]));
                    break;
                case "pop":
                    sbuilder.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case "size":
                    sbuilder.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sbuilder.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    sbuilder.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        System.out.println(sbuilder.toString());
    }
}
