package string.Sort;

import java.util.*;

public class Sorting {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        my_string = my_string.replaceAll("[^0-9]","");

        for (int i = 0; i < my_string.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }

        Collections.sort(list); // 오름차순
        // Collections.sort(list, Collections.reverseOrder()); // 내림차순

        int[] answer = {};
        answer = list.stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }
}
