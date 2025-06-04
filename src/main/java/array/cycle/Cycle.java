package array.cycle;

public class Cycle {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        int tmp = 0;

        if (direction.equals("right")) {
            tmp = numbers[len - 1];
            for (int i = len - 1; i > 0; i--) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = tmp;
        } else {
            tmp = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[len - 1] = tmp;
        }

        return answer;
    }
}
