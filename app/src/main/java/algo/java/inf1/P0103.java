package algo.java.inf1;

public class P0103 {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
                maxIndex = i;
            }
        }

        answer = arr[maxIndex];

        return answer;
    }
}
