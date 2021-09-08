package algo.java.programmers.learn;

import java.util.Arrays;

public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count1 = 0;

        for (int i = 0; i < commands.length; i++) {
            int[] newArray = new int[commands[i][1] - commands[i][0] + 1];
            int count2 = 0;

            for (int j = 0; j < array.length; j++) {
                if (j >= commands[i][0] - 1 && j <= commands[i][1] - 1) {
                    newArray[count2++] = array[j];
                }
            }

            Arrays.sort(newArray);

            for (int j = 0; j < newArray.length; j++) {
                if (j == commands[i][2] - 1) {
                    answer[count1++] = newArray[j];
                }
            }
        }

        return answer;
    }
}
