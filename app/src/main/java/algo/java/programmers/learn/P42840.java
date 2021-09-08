package algo.java.programmers.learn;

import java.util.ArrayList;

public class P42840 {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int max = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                score1++;
            }
            if (answers[i] == p2[i % p2.length]) {
                score2++;
            }
            if (answers[i] == p3[i % p3.length]) {
                score3++;
            }
        }

        max = Math.max(score1, Math.max(score2, score3));

        ArrayList<Integer> list = new ArrayList<>();

        if (max == score1) {
            list.add(1);
        }
        if (max == score2) {
            list.add(2);
        }
        if (max == score3) {
            list.add(3);
        }

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
