package algo.java.programmers.learn;

public class P42860 {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min = len - 1;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            int move = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);
            answer += move;

            int nextIndex = i + 1;

            while (nextIndex < len && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }

            min = Math.min(min, (i * 2) + len - nextIndex);
        }

        answer += min;

        return answer;
    }
}
