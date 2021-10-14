package algo.java.programmers.learn;

import java.util.Arrays;
import java.util.Comparator;

public class P42746 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }

        //배열의 값이 모두 0일 경우
        if (result[0].equals("0")) {
            return "0";
        }

        return answer;
    }
}
