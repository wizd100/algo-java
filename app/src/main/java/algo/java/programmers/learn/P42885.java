package algo.java.programmers.learn;

import java.util.Arrays;

public class P42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Arrays.sort(people);

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
            }
            answer++;
        }

        return answer;
    }
}
