package algo.java.programmers.learn;

public class P84512 {
    public int solution(String word) {
        //https://hello-backend.tistory.com/38
        int answer = 0;
        char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
        int range = 781;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j]) {
                    answer += 1 + j * range;
                }
            }
            range = (range - 1) / 5;
        }

        return answer;
    }
}
